import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.stringtemplate.v4.*;

public class CompilerVisitor extends kubojBaseVisitor<CodeFragment> {
	private Map<String, Function> functions = new HashMap<String, Function>();
	private HashMap<Function, HashMap<String, Variable>> variables = new HashMap<Function, HashMap<String, Variable>>();
	private int labelIndex = 0;
	private int registerIndex = 0;
	private Logger logger;
	public String error = "";
	private Function currentFunction = null;
	
	public CompilerVisitor(boolean loggerEnabled) {
		super();
		logger = new Logger(loggerEnabled);
	}

	private String generateNewLabel() {
		return String.format("L%d", this.labelIndex++);
	}

	private String generateNewRegister() {
		return String.format("%%R%d", this.registerIndex++);
	}
	
	private Variable getVariable(String identifier) {
		return variables.get(currentFunction).get(identifier);
	}
	
	private boolean variableExists(String identifier) {
		return variables.get(currentFunction).containsKey(identifier);
	}
	
	private Variable putVariable(String identifier, Variable variable) {
		return variables.get(currentFunction).put(identifier, variable);
	}

	@Override
	public CodeFragment visitInit(kubojParser.InitContext ctx) {
		logger.writeFunction(ctx);
		CodeFragment code = new CodeFragment();

		// include built-in function
		functions.put("writeint", new Function("writeint", "i32", new ArrayList<String>(Arrays.asList("i32"))));
		functions.put("writestr", new Function("writestr", "i32", new ArrayList<String>(Arrays.asList("i8*"))));
		functions.put("writeintnl", new Function("writeintnl", "i32", new ArrayList<String>(Arrays.asList("i32"))));
		functions.put("writestrnl", new Function("writestrnl", "i32", new ArrayList<String>(Arrays.asList("i8*"))));
		functions.put("readint", new Function("readint", "i32", new ArrayList<String>()));
		functions.put("mallocint", new Function("mallocint", "i32*", new ArrayList<String>(Arrays.asList("i32"))));

		for (Map.Entry<String, Function> e : functions.entrySet()) {
			code.addCode(e.getValue().getLlvmDeclarationString());
		}
		
		for (kubojParser.Import_functionContext c : ctx.import_function()) {
			CodeFragment import_function = visit(c);
			code.addCode(import_function);
			code.setRegister(import_function.getRegister());
		}
		
		if (functions.size() > 0) {
			code.addCode("\n");
		}

		for (kubojParser.Declaration_functionContext s : ctx.declaration_function()) {
			CodeFragment declaration_function = visit(s);
			code.addCode(declaration_function);
			code.setRegister(declaration_function.getRegister()); // ?
		}

		CodeFragment declaration_main_function = visit(ctx.declaration_main_function());

		code.addCode(declaration_main_function);
		code.setRegister(declaration_main_function.getRegister()); // ?

		return code;
	}
	
	@Override
	public CodeFragment visitImport_function(kubojParser.Import_functionContext ctx) {
		logger.tab(ctx);
		CodeFragment code = new CodeFragment();

		String returnType = Variable.myTypeToLlvmType(ctx.type(0).getText());
		String identifier = ctx.IDENTIFIER().getText();
		ArrayList<String> parameterTypes = new ArrayList<String>();
		
		if (ctx.type().size() > 1) {
			for (int i = 1; i < ctx.type().size(); i++) {
				parameterTypes.add(Variable.myTypeToLlvmType(ctx.type(i).getText()));
			}
		}
		
		logger.log("trying to import function '%s %s' ", returnType, identifier);
		
		if (functions.containsKey(identifier)) {
			error += String.format("Error: function '%s' already defined\n", identifier);
		} else {
			Function f = new Function(identifier, returnType, parameterTypes);
			functions.put(identifier, f);
			variables.put(f, new HashMap<String, Variable>()); 
			code.addCode(f.getLlvmDeclarationString());
		}
		
		logger.logCode(code);
		logger.untab();
		return code;
	}

	@Override
	public CodeFragment visitDeclaration_main_function(kubojParser.Declaration_main_functionContext ctx) {
		logger.tab(ctx);
		
		Function function = new Function(
				ctx.MAIN().getText(),
				Variable.myTypeToLlvmType(ctx.TYPE_INT().getText()),
				new ArrayList<String>());
		functions.put(ctx.MAIN().getText(), function);
		variables.put(function, new HashMap<String, Variable>());
		this.currentFunction = function;

		ST template = new ST( 
				"define i32 @main() {\n" + 
				"<body_code>" + 
				"}\n"
		);
		CodeFragment body = visit(ctx.function_body());
		body.addTab();
		template.add("body_code", body);

		CodeFragment code = new CodeFragment();
		code.addCode(template.render());
		code.setRegister(body.getRegister());
		
		logger.untab();
		return code;
	}

	@Override
	public CodeFragment visitDeclaration_function(kubojParser.Declaration_functionContext ctx) {
		logger.tab(ctx);
		CodeFragment code = new CodeFragment();
		
		String identifier = ctx.IDENTIFIER().getText();
		String returnType = Variable.myTypeToLlvmType(ctx.type().getText());
		
		logger.log("trying to define function '%s %s'", returnType, identifier);

		if (functions.containsKey(identifier)) {
			error += String.format("Error: function '%s' already declared [context: %s]\n", identifier, ctx.getText());
		} else {
			Function function = new Function(identifier, returnType);
			functions.put(identifier, function);
			variables.put(function, new HashMap<String, Variable>());
			currentFunction = function;
			
			ParameterListCodeFragment parameterList = (ParameterListCodeFragment) visit(ctx.parameter_list());
			ArrayList<String> parameterTypes = parameterList.getTypes();
			ArrayList<String> registers = parameterList.getRegisters();
			
			function.setParameterTypes(parameterTypes);
			
			ST template = new ST(
					"<define_string> {\n" +
					Utils.addTab("paraminit:\n", CodeFragment.TAB_WIDTH) +
					"<paraminit_code>" +
					Utils.addTab("br label %start \n", CodeFragment.TAB_WIDTH * 2) +
					"<body_code>" + 
					"}\n\n"
			);
			template.add("define_string", function.getLlvmDefinitionString(registers));
			parameterList.addTab();
			parameterList.addTab();
			template.add("paraminit_code", parameterList.toString());
			CodeFragment body = visit(ctx.function_body());
			body.addTab();
			template.add("body_code", body.toString());
			code.addCode(template.render());
		}
		
		logger.untab();
		return code;        	
	}
	
	@Override
	public CodeFragment visitParameter_list(kubojParser.Parameter_listContext ctx) {
		logger.tab(ctx);
		ParameterListCodeFragment code = new ParameterListCodeFragment();
		
		for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
			String identifier = ctx.IDENTIFIER(i).getText();
			String type = ctx.type(i).getText();
			
			String register = generateNewRegister();
			code.addRegister(register);
			code.addType(Variable.myTypeToLlvmType(type));
			
			DeclareVariableCodeFragment declaration = (DeclareVariableCodeFragment)declareVariable(identifier, type, ctx);
			Variable variable = declaration.getVariable();
			code.addCode(declaration);
			code.addCode(String.format(
					"store %s %s, %s* %s\n",
					variable.getLlvmType(),
					register,
					variable.getLlvmType(),
					variable.getRegister()));			
		}
		
		logger.logCode(code);
		logger.untab();
		return (CodeFragment)code;   
	}

	@Override
	public CodeFragment visitFunction_body(kubojParser.Function_bodyContext ctx) {
		logger.tab(ctx);
		CodeFragment statements = new CodeFragment();

		for (kubojParser.StatementContext s: ctx.statement()) {
			CodeFragment statement = visit(s);
			statements.addCode(statement);
			statements.setRegister(statement.getRegister()); // ?
		}

		CodeFragment exp = visit(ctx.expression());

		ST template = new ST(  
				"start:\n" + 
				"<statements_code>" +
				Utils.addTab("br label %end\n", CodeFragment.TAB_WIDTH) + 
				"end:\n" +
				"<exp_code>" +
				Utils.addTab(String.format(
						"ret %s <ret_register>\n",
						currentFunction.getReturnType()
						), CodeFragment.TAB_WIDTH) // TODO type ... struct ? 
		);
		statements.addTab();
		template.add("statements_code", statements);
		exp.addTab();
		template.add("exp_code", exp);
		template.add("ret_register", exp.getRegister());

		CodeFragment code = new CodeFragment();
		code.addCode(template.render());
		code.setRegister(exp.getRegister());
		
		logger.untab();
		return code;       	
	}
	
	@Override
	public CodeFragment visitDeclaration_var(kubojParser.Declaration_varContext ctx) {
		logger.tab(ctx);
		CodeFragment code = declareVariable(ctx.IDENTIFIER().getText(), ctx.type().getText(), ctx);
		
		logger.logCode(code);
		logger.untab();
		return code;
	}	
	
	public CodeFragment declareVariable(String identifier, String type, ParserRuleContext ctx) {
		DeclareVariableCodeFragment code = new DeclareVariableCodeFragment();
		
		logger.log("trying to declare variable '%s' of type '%s'", identifier, type);
		
		if (variableExists(identifier)) {
			error += String.format("Error: Variable '%s' already declared [context: %s]\n", identifier, ctx.getText());
		} else {
			Variable variable = null;
			String mem_register = generateNewRegister();
			
			if (type.equals(Variable.MY_INT)) {
				code.addCode(String.format("%s = alloca i32\n", mem_register));
				variable = new IntVariable(identifier, mem_register);
			} else if (type.equals(Variable.MY_PINT)) {
				code.addCode(String.format("%s = alloca i32*\n", mem_register));
				variable = new PIntVariable(identifier, mem_register);
			} else {
				error += String.format("Error: Unknown type '%s' [context: %s]\n", type, ctx.getText());
			}
			putVariable(identifier, variable);
			code.setVariable(variable);
		}
		
		return code;
	}

	@Override
	public CodeFragment visitStr(kubojParser.StrContext ctx) {
		logger.tab(ctx);
		CodeFragment code = new CodeFragment();
		
		String s = ctx.STRING().getText();
		s = Utils.unescapeJavaString(s.substring(1, s.length() - 1)); // remove double quotes
		String hexString = Utils.stringToHex(s);
		
		ST template = new ST(
				"<reg1> = alloca [<str_size> x i8]\n" + 
				"store [<str_size> x i8] c\"<hex_str>\", [<str_size> x i8]* <reg1>\n" +
				"<reg2> = getelementptr [<str_size> x i8]* <reg1>, i64 0, i64 0\n"
		);
		String reg1 = generateNewRegister();
		String reg2 = generateNewRegister();
		template.add("reg1", reg1);
		template.add("reg2", reg2);
		template.add("hex_str", hexString);
		template.add("str_size", s.length() + 1);

		code.setRegister(reg2);
		code.addCode(template.render());

		logger.logCode(code);
		logger.untab();
		return code;
	}

	@Override
	public CodeFragment visitFunction_call(kubojParser.Function_callContext ctx) {
		logger.tab(ctx);
		CodeFragment code = new CodeFragment();

		String functionName = ctx.IDENTIFIER().getText();
		if (!functions.containsKey(functionName)) {
			error += String.format("Error: unknown function '%s' [context: %s]\n", functionName, ctx.getText()); 
		}

		ArgumentListCodeFragment argumentList = (ArgumentListCodeFragment)visit(ctx.argument_list());
		code.addCode(argumentList);

		String retvalRegister = generateNewRegister();
		
		code.addCode(functions.get(functionName).getCallInstruction(retvalRegister, argumentList.getRegisters()));
		code.setRegister(retvalRegister);

		logger.logCode(code);
		logger.untab();
		return code;
	}        

	@Override
	public CodeFragment visitArgument_list(kubojParser.Argument_listContext ctx) {
		logger.tab(ctx);
		ArgumentListCodeFragment code = new ArgumentListCodeFragment();

		for (kubojParser.ExpressionContext e : ctx.expression()) {
			CodeFragment expression = visit(e);
			code.addCode(expression);
			code.addRegister(expression.getRegister());
		}

		logger.logCode(code);
		logger.untab();
		return (CodeFragment)code;
	}
	
	@Override
	public CodeFragment visitAssignment(kubojParser.AssignmentContext ctx) {
		logger.tab(ctx);
		CodeFragment code = new CodeFragment();
		
		String identifier = ctx.IDENTIFIER().getText();
		CodeFragment expression = visit(ctx.expression());
		Variable variable = null;
		
		logger.log("found identifier '%s'", identifier);
		
		if (!variableExists(identifier)) {
			error += String.format("Error: unknown identifier '%s' [context: %s]\n", identifier, ctx.getText());
		} else {
			variable = getVariable(identifier);
			if (ctx.index_to_array() == null) {
				logger.log("not indexing to array");
				
				// TODO refactor
				String type = "";
				if (variable.isInt()) {
					type = "i32";
				} else if (variable.isPInt()) {
					type = "i32*";
				}
				code.addCode(expression);
				code.addCode(String.format(
						"store %s %s, %s* %s\n",
						type,
						expression.getRegister(),
						type,
						variable.getRegister()
				));
				logger.log("assign to " + variable);
			} else {
				logger.log("indexing to array");
				CodeFragment index = visit(ctx.index_to_array());
				code.addCode(index);
				code.addCode(expression);
				String register = generateNewRegister();
				String register2 = generateNewRegister();
				code.addCode(String.format(
						"%s = load i32** %s\n",
						register,
						variable.getRegister()
				));
				code.addCode(String.format(
						"%s = getelementptr i32* %s, i32 %s\n",
						register2,
						register,
						index.getRegister()
				));
				code.addCode(String.format(
						"store i32 %s, i32* %s\n",
						expression.getRegister(),
						register2
				));
				code.setRegister(register2);
			}
		}
		
		logger.logCode(code);
		logger.untab();
		return code;
	}

	@Override
	public CodeFragment visitInd(kubojParser.IndContext ctx) {
		logger.tab(ctx);
		CodeFragment code = new CodeFragment();
		
		String identifier = ctx.IDENTIFIER().getText();
		CodeFragment index = visit(ctx.index_to_array());
		code.addCode(index);
		
		if (!variableExists(identifier)) {
			error += String.format("Error: unknown identifier '%s' [context: %s]\n", identifier, ctx.getText());
		} else {
			Variable variable = getVariable(identifier);
			
			String register = generateNewRegister();
			code.addCode(String.format(
					"%s = load i32** %s\n",
					register,
					variable.getRegister()
			));
			String register2 = generateNewRegister();
			code.addCode(String.format(
					"%s = getelementptr i32* %s, i32 %s\n",
					register2,
					register,
					index.getRegister()
			));
			String register3 = generateNewRegister();
			code.addCode(String.format(
					"%s = load i32* %s\n",
					register3,
					register2
			));
			code.setRegister(register3);
		}
		
		logger.logCode(code);
		logger.untab();
		return code;		
	}    
	
	@Override
	public CodeFragment visitIndex_to_array(kubojParser.Index_to_arrayContext ctx) {
		return visit(ctx.expression());
	}

	@Override
	public CodeFragment visitVar(kubojParser.VarContext ctx) {
		logger.tab(ctx);
		CodeFragment code = new CodeFragment();
		
		String identifier = ctx.IDENTIFIER().getText();
		Variable variable = null;
		if (!variableExists(identifier)) {
			error += String.format("Error: unknown identifier '%s' [context: %s]\n", identifier, ctx.getText());
		} else {
			variable = getVariable(identifier);
		}
		
		String register = generateNewRegister();
		code.addCode(String.format(
				"%s = load %s* %s\n",
				register,
				variable.getLlvmType(),
				variable.getRegister()
		));
		code.setRegister(register);
		
		logger.logCode(code);
		logger.untab();
		return code;
	}
	
	@Override
	public CodeFragment visitStruct_if(kubojParser.Struct_ifContext ctx) {
		logger.tab(ctx);
		CodeFragment code = new CodeFragment();
		
        CodeFragment condition = visit(ctx.expression());
        CodeFragment statement_true = visit(ctx.block(0));
        CodeFragment statement_false = null;
        
        if (ctx.block(1) == null) {
        	statement_false = new CodeFragment();
        } else {
        	statement_false = visit(ctx.block(1));	
        }

        ST template = new ST(
                "<condition_code>" + 
                "<cmp_reg> = icmp ne i32 <con_reg>, 0\n" + 
                "br i1 <cmp_reg>, label %<block_true>, label %<block_false>\n" +
                "<block_true>:\n" +
                "<statement_true_code>" +
                Utils.addTab("br label %<block_end>\n", CodeFragment.TAB_WIDTH) + 
                "<block_false>:\n" + 
                "<statement_false_code>" +
                Utils.addTab("br label %<block_end>\n", CodeFragment.TAB_WIDTH) + 
                "<block_end>:\n" +
                Utils.addTab("<ret> = add i32 0, 0\n", CodeFragment.TAB_WIDTH)
        );
        template.add("condition_code", condition);
        template.add("statement_true_code", Utils.addTab(statement_true.toString(), CodeFragment.TAB_WIDTH));
        template.add("statement_false_code", Utils.addTab(statement_false.toString(), CodeFragment.TAB_WIDTH));
        template.add("cmp_reg", this.generateNewRegister());
        template.add("con_reg", condition.getRegister());
        template.add("block_true", this.generateNewLabel());
        template.add("block_false", this.generateNewLabel());
        template.add("block_end", this.generateNewLabel());
        String return_register = generateNewRegister();
        template.add("ret", return_register);
        
        code.setRegister(return_register);
        code.addCode(template.render());

		logger.untab();
		return code;
	}
	
	@Override
	public CodeFragment visitStruct_for(kubojParser.Struct_forContext ctx) {
		logger.tab(ctx);
		CodeFragment code = new CodeFragment();
		
        CodeFragment condition = visit(ctx.expression());
        CodeFragment body = visit(ctx.block());
        CodeFragment assignment = visit(ctx.assignment());
        body.addCode(assignment);
        
        ST template = new ST(
                "br label %<cmp_label>\n" + 
                "<cmp_label>:\n" + 
                "<condition_code>" +
                Utils.addTab("<cmp_register> = icmp ne i32 <condition_register>, 0\n", CodeFragment.TAB_WIDTH) + 
                Utils.addTab("br i1 <cmp_register>, label %<body_label>, label %<end_label>\n", CodeFragment.TAB_WIDTH) + 
                "<body_label>:\n" + 
                "<body_code>" + 
                Utils.addTab("br label %<cmp_label>\n", CodeFragment.TAB_WIDTH) + 
                Utils.addTab("<end_label>:\n", CodeFragment.TAB_WIDTH) + 
                Utils.addTab("<ret> = add i32 0, 0\n", CodeFragment.TAB_WIDTH)
        );
        template.add("cmp_label", generateNewLabel());
        template.add("condition_code", Utils.addTab(condition.toString(), CodeFragment.TAB_WIDTH));
        template.add("cmp_register", generateNewRegister());
        template.add("condition_register", condition.getRegister());
        template.add("body_label", generateNewLabel());
        template.add("end_label", generateNewLabel());
        template.add("body_code", Utils.addTab(body.toString(), CodeFragment.TAB_WIDTH));
        String end_register = generateNewRegister();
        template.add("ret", end_register);
        
        code.addCode(template.render());
        code.setRegister(end_register);
		
		logger.logCode(code);
		logger.untab();
		return code;
	}
	
    @Override
    public CodeFragment visitComp(kubojParser.CompContext ctx) {
    	Integer operator = ctx.op.getType();
    	CodeFragment left = visit(ctx.expression(0));
    	CodeFragment right = visit(ctx.expression(1));

        String code_stub = "<ret> = icmp <cond> i32 <left_val>, <right_val>\n" +
        				   "<ret2> = zext i1 <ret> to i32";
        String cond = "";
        
        switch (operator) {
                case kubojParser.LESS:
                    cond = "ult";
                    break;
                case kubojParser.LESSEQ:
                	cond = "ule";
                    break;
                case kubojParser.GREATER:
                	cond = "ugt";
                    break;
                case kubojParser.GREATEREQ:
                	cond = "uge";
                    break;
                case kubojParser.DOUBLEEQ:
                	cond = "eq";
                    break;                            
                case kubojParser.NOTEQ:
                	cond = "ne";
                    break;
        }
        
        ST template = new ST(
                "<left_code>" + 
                "<right_code>" + 
                code_stub
        );
        template.add("left_code", left);
        template.add("right_code", right);
        template.add("cond", cond);
        template.add("left_val", left.getRegister());
        template.add("right_val", right.getRegister());
        String ret_register = this.generateNewRegister();
        String ret2_register = this.generateNewRegister();
        template.add("ret", ret_register);
        template.add("ret2", ret2_register);
        
        CodeFragment ret = new CodeFragment();
        ret.setRegister(ret2_register);
        ret.addCode(template.render());
        return ret;
        		
    }
	
	@Override
	public CodeFragment visitFunc(kubojParser.FuncContext ctx) {
		return visit(ctx.function_call());
	}
	
	@Override
	public CodeFragment visitUna(kubojParser.UnaContext ctx) {
		logger.tab(ctx);
		CodeFragment code = generateUnaryOperatorCodeFragment(
                visit(ctx.expression()),
                ctx.op.getType()
        );
		
		logger.logCode(code);
		logger.untab();
		return code;
	}
	
	@Override
	public CodeFragment visitNot(kubojParser.NotContext ctx) {
		logger.tab(ctx);
		CodeFragment code = generateUnaryOperatorCodeFragment(
                visit(ctx.expression()),
                ctx.op.getType()
        );
		
		logger.logCode(code);
		logger.untab();
		return code;
	}

	@Override
	public CodeFragment visitMul(kubojParser.MulContext ctx) {
		logger.tab(ctx);
		CodeFragment code = generateBinaryOperatorCodeFragment(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                ctx.op.getType()
        );
		
		logger.logCode(code);
		logger.untab();
		return code;
	}

	@Override
	public CodeFragment visitAdd(kubojParser.AddContext ctx) {
		logger.tab(ctx);
		CodeFragment code = generateBinaryOperatorCodeFragment(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                ctx.op.getType()
        );
		
		logger.logCode(code);
		logger.untab();
		return code;
	} 
	
	@Override
	public CodeFragment visitAnd(kubojParser.AndContext ctx) {
		logger.tab(ctx);
		CodeFragment code = generateBinaryOperatorCodeFragment(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                ctx.op.getType()
        );
		
		logger.logCode(code);
		logger.untab();
		return code;
	}      
	
	@Override
	public CodeFragment visitOr(kubojParser.OrContext ctx) {
		logger.tab(ctx);
		CodeFragment code = generateBinaryOperatorCodeFragment(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                ctx.op.getType()
        );
		
		logger.logCode(code);
		logger.untab();
		return code;
	}      

	@Override
	public CodeFragment visitMod(kubojParser.ModContext ctx) {
		logger.tab(ctx);
		CodeFragment code = generateBinaryOperatorCodeFragment(
                visit(ctx.expression(0)),
                visit(ctx.expression(1)),
                ctx.op.getType()
        );
		
		logger.logCode(code);
		logger.untab();
		return code;
	}
	
	@Override
	public CodeFragment visitPar(kubojParser.ParContext ctx) {
        return visit(ctx.expression());
	}
	
	@Override
	public CodeFragment visitBlock(kubojParser.BlockContext ctx) {
		logger.tab(ctx);
		CodeFragment code = new CodeFragment();

		for (kubojParser.StatementContext s: ctx.statement()) {
			CodeFragment statement = visit(s);
			code.addCode(statement);
			code.setRegister(statement.getRegister()); // ?
		}
		
		logger.logCode(code);
		logger.untab();
		return code;		
	}

	@Override
	public CodeFragment visitInt(kubojParser.IntContext ctx) {
		logger.tab(ctx);
		CodeFragment code = new CodeFragment();
		
        String value = ctx.INT().getText();
        String register = generateNewRegister();
        code.setRegister(register);
        code.addCode(String.format("%s = add i32 0, %s\n", register, value));
        
        logger.logCode(code);
        logger.untab();
        return code;
	}
	
	public CodeFragment generateUnaryOperatorCodeFragment(CodeFragment code, Integer operator) {
		if (operator == kubojParser.ADD) {
			return code;
		}

		String code_stub = "";
		switch(operator) {
		case kubojParser.SUB:
			code_stub = "<ret> = sub i32 0, <input>\n";
			break;
		case kubojParser.NOT:
			ST temp = new ST(
					"<r> = icmp eq i32 \\<input>, 0\n" + 
							"\\<ret> = zext i1 <r> to i32\n"
					);
			temp.add("r", this.generateNewRegister());
			code_stub = temp.render();
			break;
		}
		ST template = new ST("<code>" + code_stub);
		String ret_register = this.generateNewRegister();
		template.add("code", code);
		template.add("ret", ret_register);
		template.add("input", code.getRegister());

		CodeFragment ret = new CodeFragment();        
		ret.setRegister(ret_register);
		ret.addCode(template.render());
		return ret;
	}
	
	public CodeFragment generateBinaryOperatorCodeFragment(CodeFragment left, CodeFragment right, Integer operator) {
		String code_stub = "<ret> = <instruction> i32 <left_val>, <right_val>\n";
		String instruction = "or";
		switch (operator) {
		case kubojParser.ADD:
			instruction = "add";
			break;
		case kubojParser.SUB:
			instruction = "sub";
			break;
		case kubojParser.MUL:
			instruction = "mul";
			break;
		case kubojParser.DIV:
			instruction = "sdiv";
			break;
		case kubojParser.MOD:
			instruction = "srem";
			break;
		case kubojParser.AND:
			instruction = "and";
		case kubojParser.OR:
			ST temp = new ST(
					"<r1> = icmp ne i32 \\<left_val>, 0\n" +
							"<r2> = icmp ne i32 \\<right_val>, 0\n" +
							"<r3> = \\<instruction> i1 <r1>, <r2>\n" +
							"\\<ret> = zext i1 <r3> to i32\n"
					);
			temp.add("r1", this.generateNewRegister());
			temp.add("r2", this.generateNewRegister());
			temp.add("r3", this.generateNewRegister());
			code_stub = temp.render();
			break;
		}
		ST template = new ST(
				"<left_code>" + 
						"<right_code>" + 
						code_stub
				);
		template.add("left_code", left);
		template.add("right_code", right);
		template.add("instruction", instruction);
		template.add("left_val", left.getRegister());
		template.add("right_val", right.getRegister());
		String ret_register = this.generateNewRegister();
		template.add("ret", ret_register);

		CodeFragment ret = new CodeFragment();
		ret.setRegister(ret_register);
		ret.addCode(template.render());
		return ret;

	}
	
	@Override
	public CodeFragment visitStDec(kubojParser.StDecContext ctx) {
		return visit(ctx.declaration_var());
	}
	
	@Override
	public CodeFragment visitStAss(kubojParser.StAssContext ctx) {
		return visit(ctx.assignment());
	}
	
	@Override
	public CodeFragment visitStFor(kubojParser.StForContext ctx) {
		return visit(ctx.struct_for());
	}
	
	@Override
	public CodeFragment visitStIf(kubojParser.StIfContext ctx) {
		return visit(ctx.struct_if());
	}

	@Override
	public CodeFragment visitStExp(kubojParser.StExpContext ctx) {
		return visit(ctx.expression());
	}
}
