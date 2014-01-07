import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.stringtemplate.v4.*;
import org.antlr.v4.runtime.ParserRuleContext;

@SuppressWarnings("serial")
class TypeMismatchException extends Exception {
}

public class CompilerVisitor extends foxtrotBaseVisitor<CodeFragment> {
	private Map<Function, Map<String, Variable>> mem = new HashMap<Function, Map<String, Variable>>();
	private Map<String, Function> func = new HashMap<String, Function>();
	private Map<String, String> consts = new HashMap<String, String>();
	private int labelIndex = 0;
	private int registerIndex = 0;
	private int constIndex = 0;
	private int funcIndex = 0;
	private static final Function GLOBAL_SCOPE = new Function("main", "int");
	private Function scope = GLOBAL_SCOPE;

	public static final String DEFAULT_STRING = "DefaultStringValue";

	public CompilerVisitor() {
		enterScope(GLOBAL_SCOPE);
	}

	private String generateNewLabel() {
		return String.format("L%d", this.labelIndex++);
	}

	private String generateNewRegister() {
		return String.format("%%R%d", this.registerIndex++);
	}

	private String generateNewConst() {
		return String.format("@.c%d", this.constIndex++);
	}

	private String generateNewFunc(String name) {
		return String.format("@f%s_%s", this.funcIndex++, name);
	}

	private String formatLine(ParserRuleContext ctx) {
		return String.format("%d:%d", ctx.getStart().getLine(), ctx.getStart()
				.getCharPositionInLine());
	}

	private void showError(ParserRuleContext ctx, String message) {
		System.err.println("Line " + formatLine(ctx) + ": " + message);
	}

	private void enterScope(Function f) {
		this.scope = f;

		if (!mem.containsKey(f)) {
			mem.put(f, new HashMap<String, Variable>());
		}
	}

	private void exitScope() {
		this.scope = GLOBAL_SCOPE;
	}

	private Function currentScope() {
		return this.scope;
	}

	private Map<String, Variable> mem(Function f) {
		return this.mem.get(f);
	}

	private Map<String, Variable> mem() {
		return mem(currentScope());
	}

	@Override
	public CodeFragment visitDeclare(foxtrotParser.DeclareContext ctx) {
		CodeFragment code;

		if (ctx.var_declaration() != null) {
			code = visit(ctx.var_declaration());
		} else {
			code = visit(ctx.array_declaration());
		}

		return code;
	}

	public CodeFragment declareVar(ParserRuleContext ctx, String identifier,
			String varType) {
		CodeFragment ret = new CodeFragment();
		String register;

		if (mem().containsKey(identifier)) {
			showError(ctx, String.format(
					"variable '%s' has already been declared", identifier));
		} else {
			register = this.generateNewRegister();
			mem().put(identifier, new Variable(register, varType));
			ret.setVarType(varType);

			if (ret.isInt()) {
				ret.addCode(String.format("%s = alloca i32\n", register));
			} else if (ret.isString()) {
				String constRegister = this.generateNewConst();
				consts.put(constRegister, DEFAULT_STRING);
				ret.addCode(String.format(
						"%s = getelementptr [%s x i8]* %s, i64 0, i64 0\n",
						register, DEFAULT_STRING.length() + 1, constRegister));
			}

			ret.setRegister(register);
		}

		return ret;
	}

	@Override
	public CodeFragment visitDeclareVar(foxtrotParser.DeclareVarContext ctx) {
		return declareVar(ctx, ctx.identifier().getText(), ctx.var_type()
				.getText());
	}

	@Override
	public CodeFragment visitDeclareArray(foxtrotParser.DeclareArrayContext ctx) {
		String identifier = ctx.identifier().getText();
		CodeFragment ret = new CodeFragment();
		CodeFragment size;
		String register;
		String t;
		String arraySize;
		Variable var;
		List<String> sizeRegisters = new ArrayList<String>();

		if (mem().containsKey(identifier)) {
			showError(ctx,
					String.format("variable '%s' already declared", identifier));
		} else {
			register = this.generateNewRegister();
			arraySize = this.generateNewRegister();
			var = new Variable(register, "int");
			var.arity = ctx.expression().size();
			mem().put(identifier, var);
			ret.setVarType(var.varType);
			ret.addCode(String.format("%s = add i32 1, 0\n", arraySize));

			for (foxtrotParser.ExpressionContext s : ctx.expression()) {
				size = visit(s);
				t = this.generateNewRegister();
				ret.addCode(size);
				ret.addCode(String.format("%s = mul i32 %s, %s\n", t,
						size.getRegister(), arraySize));
				arraySize = t;
				sizeRegisters.add(size.getRegister());
			}

			t = this.generateNewRegister();
			ret.addCode(String.format("%s = add i32 %s, %s\n", t,
					var.arity + 1, arraySize));
			arraySize = t;

			ret.addCode(String.format("%s = alloca i32, i32 %s\n", register,
					arraySize));

			// save array arity at index 0
			t = this.generateNewRegister();
			ret.addCode(String
					.format("%s = getelementptr inbounds i32* %s, i32 0\n", t,
							register));
			ret.addCode(String.format("store i32 %s, i32* %s\n", var.arity, t));

			for (int i = 0; i < sizeRegisters.size(); ++i) {
				t = this.generateNewRegister();
				ret.addCode(String.format(
						"%s = getelementptr inbounds i32* %s, i32 %s\n", t,
						register, i + 1));
				ret.addCode(String.format("store i32 %s, i32* %s\n",
						sizeRegisters.get(i), t));
			}

			ret.setRegister(register);
		}

		return ret;
	}

	@Override
	public CodeFragment visitAssign(foxtrotParser.AssignContext ctx) {
		CodeFragment value = visit(ctx.expression());
		String mem_register;
		String pointer;
		ST template;
		CodeFragment ret = new CodeFragment();
		CodeFragment idx = new CodeFragment();
		String identifier = ctx.lvalue().identifier().getText();
		Variable var;
		String s = "";

		if (mem().containsKey(identifier)) {
			var = mem().get(identifier);
			mem_register = var.name;

			ret.setVarType(var.varType);

			if (ret.isInt()) {
				if (var.isArray()) {
					if (var.arity != ctx.lvalue().expression().size())
						showError(ctx, String.format(
								"array %s: incorrect number of indices",
								identifier));
					idx = generateIndexingCodeFragment(var, ctx.lvalue()
							.expression());
					mem_register = idx.getRegister();
				}

				s = "<value_code><idx_code>"
						+ "store i32 <value_register>, i32* <mem_register>\n";
			} else if (ret.isString()) {
				var.name = this.generateNewRegister();
				mem_register = var.name;
				s = "<value_code><idx_code>"
						+ "<mem_register> = getelementptr i8* <value_register>, i64 0\n";
			}

			template = new ST(s);
			template.add("value_code", value);
			template.add("idx_code", idx);
			template.add("value_register", value.getRegister());
			template.add("mem_register", mem_register);
			ret.addCode(template.render());
		} else {
			showError(ctx, String.format("identifier '%s' does not exists",
					identifier));
		}

		ret.setRegister(value.getRegister());
		return ret;
	}

	public CodeFragment generateIndexingCodeFragment(Variable var,
			List<foxtrotParser.ExpressionContext> expressions) {
		CodeFragment ret = new CodeFragment();
		CodeFragment idx;
		String size, t, arity;
		String idxRegister;
		String register;

		idxRegister = this.generateNewRegister();
		idx = visit(expressions.get(0));

		ret.addCode(idx);
		ret.addCode(String.format("%s = add i32 0, %s\n", idxRegister,
				idx.getRegister()));

		for (int i = 1; i < expressions.size(); ++i) {
			idx = visit(expressions.get(i));

			t = this.generateNewRegister();
			size = this.generateNewRegister();
			ret.addCode(String.format(
					"%s = getelementptr inbounds i32* %s, i32 %s\n", t,
					var.name, i + 1));
			ret.addCode(String.format("%s = load i32* %s\n", size, t));

			ret.addCode(idx);
			register = this.generateNewRegister();
			ret.addCode(String.format("%s = mul i32 %s, %s\n", register,
					idxRegister, size));
			idxRegister = this.generateNewRegister();
			ret.addCode(String.format("%s = add i32 %s, %s\n", idxRegister,
					register, idx.getRegister()));
		}

		t = this.generateNewRegister();
		arity = this.generateNewRegister();
		ret.addCode(String.format(
				"%s = getelementptr inbounds i32* %s, i32 0\n", t, var.name));
		ret.addCode(String.format("%s = load i32* %s\n", arity, t));

		t = this.generateNewRegister();
		ret.addCode(String.format("%s = add i32 1, %s\n", t, arity));

		register = this.generateNewRegister();
		ret.addCode(String.format("%s = add i32 %s, %s\n", register, t,
				idxRegister));

		idxRegister = this.generateNewRegister();
		ret.setRegister(idxRegister);
		ret.addCode(String.format(
				"%s = getelementptr inbounds i32* %s, i32 %s\n", idxRegister,
				var.name, register));

		return ret;
	}

	@Override
	public CodeFragment visitIdx(foxtrotParser.IdxContext ctx) {
		CodeFragment ret = new CodeFragment();
		CodeFragment idx;
		String identifier = ctx.identifier().getText();
		Variable var;
		String register;

		if (mem().containsKey(identifier)) {
			var = mem().get(identifier);

			if (var.arity == ctx.expression().size()) {
				idx = generateIndexingCodeFragment(var, ctx.expression());
				register = this.generateNewRegister();
				ret.setRegister(register);
				ret.setVarType(var.varType);
				ret.addCode(idx);
				ret.addCode(String.format("%s = load i32* %s\n", register,
						idx.getRegister()));
			} else {
				showError(ctx, String.format(
						"array %s: incorrect number of indices", identifier));
			}
		} else {
			showError(ctx, String.format("array %s does not exist", identifier));
		}

		return ret;
	}

	@Override
	public CodeFragment visitDef(foxtrotParser.DefContext ctx) {
		CodeFragment ret = new CodeFragment();
		CodeFragment returnRegister = new CodeFragment();
		CodeFragment body;
		String identifier = ctx.identifier().getText();
		String returnType = ctx.return_type().getText();
		ST template;
		Function f;
		String args = "";
		String s = "";
		String returnCode = "ret i32 0\n";
		String retType = "i32";
		String varType;
		String arg;
		Integer arity;
		Variable var;
		String intArgs = "";
		CodeFragment argCode;
		String argRegister;

		if (func.containsKey(identifier)) {
			showError(ctx, String.format(
					"function '%s' has already been defined", identifier));
		} else {
			f = new Function(generateNewFunc(identifier), returnType);
			func.put(identifier, f);

			enterScope(f);

			for (foxtrotParser.ArgumentContext a : ctx.argument()) {
				varType = a.var_type().getText();
				arg = a.identifier().getText();
				arity = (a.arity() == null) ? 0 : Integer.parseInt(a.arity()
						.getText());

				argCode = declareVar(ctx, arg, varType);
				var = mem().get(arg);
				var.arity = arity;
				f.args.add(var);

				if (!args.isEmpty())
					args += ", ";

				if (var.isInt() && !var.isArray()) {
					argRegister = this.generateNewRegister();
					intArgs += argCode.toString();
					args += var.llvmType() + " " + argRegister;
					intArgs += String.format("store i32 %s, i32* %s\n",
							argRegister, var.name);
				} else {
					args += var.llvmType() + " " + var.name;
				}
			}

			body = visit(ctx.statements());

			if (ctx.expression() != null) {
				returnRegister = visit(ctx.expression());
			}

			s = "define <returnType> <name>(<args>) {\n" + "<int_args>"
					+ "<body>" + "<return>" + "}\n";

			if (f.returnsInt()) {
				returnCode = String.format("%s" + "ret i32 %s\n",
						returnRegister, returnRegister.getRegister());
			} else if (f.returnsString()) {
				returnCode = String.format("%s" + "ret i8* %s\n",
						returnRegister, returnRegister.getRegister());
				retType = "i8*";
			}

			template = new ST(s);
			template.add("name", f.name);
			template.add("int_args", intArgs);
			template.add("body", body);
			template.add("return", returnCode);
			template.add("returnType", retType);
			template.add("args", args);

			f.code = template.render();

			exitScope();
		}

		return ret;
	}

	@Override
	public CodeFragment visitCall(foxtrotParser.CallContext ctx) {
		String name = ctx.function_call().identifier().getText();
		CodeFragment ret = new CodeFragment();
		String s = "";
		ST template;

		if (name.equals("print")) {
			CodeFragment code = visit(ctx.function_call().expression(0));

			if (code.isInt()) {
				s = "<value_code>" + "call i32 @printInt (i32 <value>)\n";
			} else if (code.isString()) {
				s = "<value_code>" + "call i32 @printString(i8* <value>)\n";
			} else if (code.isVoid()) {
				showError(ctx,
						"cannot assign result from void returning function");
			}

			template = new ST(s);
			template.add("value_code", code);
			template.add("value", code.getRegister());
			ret.addCode(template.render());
		} else if (name.equals("newline")) {
			ret.addCode("call i32 @println()\n");
		} else if (name.equals("exit")) {
			ret.addCode("call i32 @myExit()\n");
		} else {
			ret = callFunc(ctx, name, ctx.function_call().expression());
		}

		return ret;
	}

	public CodeFragment generateBinaryOperatorCodeFragment(CodeFragment left,
			CodeFragment right, Integer operator) throws TypeMismatchException {
		String code_stub = "<ret> = <instruction> i32 <left_val>, <right_val>\n";
		String instruction = "or";

		if (!left.isInt() || !right.isInt()) {
			throw new TypeMismatchException();
		}

		ST temp = new ST(
				"<r1> = icmp \\<instruction> i32 \\<left_val>, \\<right_val>\n"
						+ "\\<ret> = zext i1 <r1> to i32\n");
		temp.add("r1", this.generateNewRegister());

		switch (operator) {
		case foxtrotParser.ADD:
			instruction = "add";
			break;
		case foxtrotParser.SUB:
			instruction = "sub";
			break;
		case foxtrotParser.MUL:
			instruction = "mul";
			break;
		case foxtrotParser.DIV:
			instruction = "sdiv";
			break;
		case foxtrotParser.EQ:
			instruction = "eq";
			code_stub = temp.render();
			break;
		case foxtrotParser.NEQ:
			instruction = "ne";
			code_stub = temp.render();
			break;
		case foxtrotParser.LT:
			instruction = "slt";
			code_stub = temp.render();
			break;
		case foxtrotParser.GT:
			instruction = "sgt";
			code_stub = temp.render();
			break;
		case foxtrotParser.GEQ:
			instruction = "sge";
			code_stub = temp.render();
			break;
		case foxtrotParser.LEQ:
			instruction = "sle";
			code_stub = temp.render();
			break;
		case foxtrotParser.AND:
			instruction = "and";
		case foxtrotParser.OR:
			temp = new ST("<r1> = icmp ne i32 \\<left_val>, 0\n"
					+ "<r2> = icmp ne i32 \\<right_val>, 0\n"
					+ "<r3> = \\<instruction> i1 <r1>, <r2>\n"
					+ "\\<ret> = zext i1 <r3> to i32\n");
			temp.add("r1", this.generateNewRegister());
			temp.add("r2", this.generateNewRegister());
			temp.add("r3", this.generateNewRegister());
			code_stub = temp.render();
			break;
		}
		ST template = new ST("<left_code>" + "<right_code>" + code_stub);
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
		ret.setVarType("int");

		return ret;
	}

	public CodeFragment generateUnaryOperatorCodeFragment(CodeFragment code,
			Integer operator) throws TypeMismatchException {
		if (!code.isInt()) {
			throw new TypeMismatchException();
		}

		if (operator == foxtrotParser.ADD) {
			return code;
		}

		String code_stub = "";
		switch (operator) {
		case foxtrotParser.SUB:
			code_stub = "<ret> = sub i32 0, <input>\n";
			break;
		case foxtrotParser.NOT:
			ST temp = new ST("<r> = icmp eq i32 \\<input>, 0\n"
					+ "\\<ret> = zext i1 <r> to i32\n");
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
		ret.setVarType("int");

		return ret;
	}

	@Override
	public CodeFragment visitAdd(foxtrotParser.AddContext ctx) {
		try {
			return generateBinaryOperatorCodeFragment(visit(ctx.expression(0)),
					visit(ctx.expression(1)), ctx.op.getType());
		} catch (TypeMismatchException e) {
			showError(ctx, "add operation requires both operands to be ints");
			return new CodeFragment();
		}
	}

	@Override
	public CodeFragment visitComp(foxtrotParser.CompContext ctx) {
		try {
			return generateBinaryOperatorCodeFragment(visit(ctx.expression(0)),
					visit(ctx.expression(1)), ctx.op.getType());
		} catch (TypeMismatchException e) {
			showError(ctx,
					"compare operation requires both operands to be ints");
			return new CodeFragment();
		}
	}

	@Override
	public CodeFragment visitMul(foxtrotParser.MulContext ctx) {
		try {
			return generateBinaryOperatorCodeFragment(visit(ctx.expression(0)),
					visit(ctx.expression(1)), ctx.op.getType());
		} catch (TypeMismatchException e) {
			showError(ctx,
					"multiply operation requires both operands to be ints");
			return new CodeFragment();
		}
	}

	@Override
	public CodeFragment visitPar(foxtrotParser.ParContext ctx) {
		return visit(ctx.expression());
	}

	@Override
	public CodeFragment visitUna(foxtrotParser.UnaContext ctx) {
		try {
			return generateUnaryOperatorCodeFragment(visit(ctx.expression()),
					ctx.op.getType());
		} catch (TypeMismatchException e) {
			showError(ctx,
					"unary sign operation requires both operands to be ints");
			return new CodeFragment();
		}
	}

	@Override
	public CodeFragment visitVar(foxtrotParser.VarContext ctx) {
		String id = ctx.identifier().getText();
		CodeFragment code = new CodeFragment();
		String register = generateNewRegister();
		Variable var;

		if (mem().containsKey(id)) {
			var = mem().get(id);
			code.setVarType(var.varType);
			code.setRegister(register);

			if (var.isArray()) {
				code.setRegister(var.name);
			} else {
				if (code.isInt()) {
					code.addCode(String.format("%s = load i32* %s\n", register,
							var.name));
				} else if (code.isString()) {
					code.addCode(String.format(
							"%s = getelementptr i8* %s, i64 0\n", register,
							var.name));
				}
			}
		} else {
			showError(ctx, String.format("identifier '%s' does not exist", id));
		}

		return code;
	}

	public CodeFragment callFunc(ParserRuleContext ctx, String name,
			List<foxtrotParser.ExpressionContext> arguments) {
		CodeFragment code = new CodeFragment();
		CodeFragment argument;
		String register = generateNewRegister();
		Function f;
		String returnType = "i32";
		String args = "";

		if (func.containsKey(name)) {
			f = func.get(name);
			code.setVarType(f.returnType);

			if (f.args.size() == arguments.size()) {
				for (int i = 0; i < arguments.size(); ++i) {
					argument = visit(arguments.get(i));
					code.addCode(argument);
	
					if (!args.isEmpty())
						args += ", ";
	
					args += f.args.get(i).llvmType() + " " + argument.getRegister();
				}
			}
			else {
				showError(ctx, String.format("function %s: incorrect number of arguments", name));
			}

			if (f.returnsString())
				returnType = "i8*";

			code.addCode(String.format("%s = call %s %s(%s)\n", register,
					returnType, f.name, args));
			code.setRegister(register);
		} else {
			showError(ctx, String.format("function '%s' does not exist", name));
		}

		return code;
	}

	@Override
	public CodeFragment visitFunc(foxtrotParser.FuncContext ctx) {
		String name = ctx.function_call().identifier().getText();
		String input;
		CodeFragment ret = new CodeFragment();

		if (name.equals("readInt")) {
			input = this.generateNewRegister();
			ret.addCode(String.format("%s = call i32 @readInt ()\n", input));
			ret.setRegister(input);
		} else {
			ret = callFunc(ctx, name, ctx.function_call().expression());
		}

		return ret;
	}

	@Override
	public CodeFragment visitInt(foxtrotParser.IntContext ctx) {
		String value = ctx.INT().getText();
		CodeFragment code = new CodeFragment();
		String register = generateNewRegister();
		code.setRegister(register);
		code.setVarType("int");
		code.addCode(String.format("%s = add i32 0, %s\n", register, value));
		return code;
	}

	@Override
	public CodeFragment visitStr(foxtrotParser.StrContext ctx) {
		String value = ctx.STRING_LITERAL().getText();
		value = value.subSequence(1, value.length() - 1).toString();
		String constRegister = this.generateNewConst();
		String register = generateNewRegister();
		CodeFragment code = new CodeFragment();

		consts.put(constRegister, value);

		code.setRegister(register);
		code.setVarType("string");
		code.addCode(String.format(
				"%s = getelementptr [%s x i8]* %s, i64 0, i64 0\n", register,
				value.length() + 1, constRegister));

		return code;
	}

	@Override
	public CodeFragment visitIf(foxtrotParser.IfContext ctx) {
		CodeFragment condition = visit(ctx.condition());
		CodeFragment statement_true = visit(ctx.tr);
		CodeFragment statement_false = new CodeFragment();

		if (ctx.fa != null) {
			statement_false = visit(ctx.fa);
		}

		ST template = new ST(
				"<condition_code>"
						+ "<cmp_reg> = icmp ne i32 <con_reg>, 0\n"
						+ "br i1 <cmp_reg>, label %<block_true>, label %<block_false>\n"
						+ "<block_true>:\n" + "<statement_true_code>"
						+ "br label %<block_end>\n" + "<block_false>:\n"
						+ "<statement_false_code>" + "br label %<block_end>\n"
						+ "<block_end>:\n" + "<ret> = add i32 0, 0\n");
		template.add("condition_code", condition);
		template.add("statement_true_code", statement_true);
		template.add("statement_false_code", statement_false);
		template.add("cmp_reg", this.generateNewRegister());
		template.add("con_reg", condition.getRegister());
		template.add("block_true", this.generateNewLabel());
		template.add("block_false", this.generateNewLabel());
		template.add("block_end", this.generateNewLabel());
		String return_register = generateNewRegister();
		template.add("ret", return_register);

		CodeFragment ret = new CodeFragment();
		ret.setRegister(return_register);
		ret.addCode(template.render());

		return ret;
	}

	@Override
	public CodeFragment visitWhile(foxtrotParser.WhileContext ctx) {
		CodeFragment condition = visit(ctx.condition());
		CodeFragment body = visit(ctx.statements());

		ST template = new ST(
				"br label %<cmp_label>\n"
						+ "<cmp_label>:\n"
						+ "<condition_code>"
						+ "<cmp_register> = icmp ne i32 <condition_register>, 0\n"
						+ "br i1 <cmp_register>, label %<body_label>, label %<end_label>\n"
						+ "<body_label>:\n" + "<body_code>"
						+ "br label %<cmp_label>\n" + "<end_label>:\n"
						+ "<ret> = add i32 0, 0\n");
		template.add("cmp_label", generateNewLabel());
		template.add("condition_code", condition);
		template.add("cmp_register", generateNewRegister());
		template.add("condition_register", condition.getRegister());
		template.add("body_label", generateNewLabel());
		template.add("end_label", generateNewLabel());
		template.add("body_code", body);
		String end_register = generateNewRegister();
		template.add("ret", end_register);

		CodeFragment ret = new CodeFragment();
		ret.addCode(template.render());
		ret.setRegister(end_register);
		return ret;
	}

	@Override
	public CodeFragment visitNot(foxtrotParser.NotContext ctx) {
		try {
			return generateUnaryOperatorCodeFragment(visit(ctx.condition()),
					ctx.op.getType());
		} catch (TypeMismatchException e) {
			showError(ctx,
					"negation operation requires both operands to be ints");
			return new CodeFragment();
		}
	}

	@Override
	public CodeFragment visitAnd(foxtrotParser.AndContext ctx) {
		try {
			return generateBinaryOperatorCodeFragment(visit(ctx.condition(0)),
					visit(ctx.condition(1)), ctx.op.getType());
		} catch (TypeMismatchException e) {
			showError(ctx,
					"logical and operation requires both operands to be ints");
			return new CodeFragment();
		}
	}

	@Override
	public CodeFragment visitOr(foxtrotParser.OrContext ctx) {
		try {
			return generateBinaryOperatorCodeFragment(visit(ctx.condition(0)),
					visit(ctx.condition(1)), ctx.op.getType());
		} catch (TypeMismatchException e) {
			showError(ctx,
					"logical or operation requires both operands to be ints");
			return new CodeFragment();
		}
	}

	@Override
	public CodeFragment visitInit(foxtrotParser.InitContext ctx) {
		CodeFragment body = visit(ctx.statements());
		CodeFragment code = new CodeFragment();
		String value;
		Function f;

		ST template = new ST("declare i32 @printInt(i32)\n"
				+ "declare i32 @printString(i8* nocapture) nounwind\n"
				+ "declare i32 @println() nounwind\n"
				+ "declare i32 @readInt() nounwind\n"
				+ "declare i32 @myExit() nounwind\n" + "<const_def>"
				+ "define i32 @main() {\n" + "start:\n" + "<body_code>"
				+ "ret i32 0\n" + "}\n" + "<func_def>");

		template.add("body_code", body);

		String constDef = "";
		String funcDef = "";

		for (String key : consts.keySet()) {
			value = consts.get(key);
			constDef += String.format("%s = global [%s x i8] c\"%s\\00\"\n",
					key, value.length() + 1, value);
		}

		for (String key : func.keySet()) {
			f = func.get(key);
			funcDef += f.code;
		}

		template.add("const_def", constDef);
		template.add("func_def", funcDef);

		code.addCode(template.render());
		code.setRegister(body.getRegister());
		code.setVarType(body.getVarType());

		return code;
	}

	@Override
	public CodeFragment visitStatements(foxtrotParser.StatementsContext ctx) {
		CodeFragment code = new CodeFragment();
		for (foxtrotParser.StatementContext s : ctx.statement()) {
			CodeFragment statement = visit(s);

			if (statement != null) {
				code.addCode(statement);
				code.setRegister(statement.getRegister());
				code.setVarType(statement.getVarType());
			}
		}
		return code;
	}

	@Override
	public CodeFragment visitNewline(foxtrotParser.NewlineContext ctx) {
		return new CodeFragment();
	}
}
