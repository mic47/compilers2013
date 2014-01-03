import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.stringtemplate.v4.*;

public class CompilerVisitor extends kubojBaseVisitor<CodeFragment> {
	private Map<String, Function> functions = new HashMap<String, Function>();
	private Map<String, String> mem = new HashMap<String, String>();
	private int labelIndex = 0;
	private int registerIndex = 0;

	private String generateNewLabel() {
		return String.format("L%d", this.labelIndex++);
	}

	private String generateNewRegister() {
		return String.format("%%R%d", this.registerIndex++);
	}

	@Override
	public CodeFragment visitInit(kubojParser.InitContext ctx) {
		functions.put("writeint", new Function("writeint", "i32", new ArrayList<String>(Arrays.asList("i32"))));
		functions.put("writestr",new Function("writestr", "i32", new ArrayList<String>(Arrays.asList("i8*"))));
		
		functions.put("writestrint",new Function("writestrint", "i32", new ArrayList<String>(Arrays.asList("i8*", "i32"))));

		CodeFragment code = new CodeFragment();
		code.addCode( // TODO: Function#getDeclarationString()
				"declare i32 @writeint(i32)\n" + 
				"declare i32 @writestr(i8*)\n" +
				"declare i32 @writestrint(i8*, i32)\n" +
			    "\n"
		);
		for (kubojParser.Declaration_functionContext s: ctx.declaration_function()) {
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
	public CodeFragment visitDeclaration_main_function(kubojParser.Declaration_main_functionContext ctx) {
		CodeFragment body = visit(ctx.function_body());

		ST template = new ST( 
				"define i32 @main() {\n" + 
				"<body_code>" + 
				"}\n"
		);
		body.addTab();
		template.add("body_code", body);

		CodeFragment code = new CodeFragment();
		code.addCode(template.render());
		code.setRegister(body.getRegister());
		return code;
	}

	@Override
	public CodeFragment visitDeclaration_function(kubojParser.Declaration_functionContext ctx) {
		CodeFragment code = new CodeFragment();
		// TODO
		return code;        	
	}

	@Override
	public CodeFragment visitFunction_body(kubojParser.Function_bodyContext ctx) {
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
				Utils.addTab("ret i32 <ret_register>\n", CodeFragment.TAB_WIDTH) // TODO type ... struct ? 
		);
		statements.addTab();
		template.add("statements_code", statements);
		exp.addTab();
		template.add("exp_code", exp);
		template.add("ret_register", exp.getRegister());

		CodeFragment code = new CodeFragment();
		code.addCode(template.render());
		code.setRegister(exp.getRegister());
		return code;       	
	}

	@Override
	public CodeFragment visitStExp(kubojParser.StExpContext ctx) {
		return visit(ctx.expression());
	}

	@Override
	public CodeFragment visitStr(kubojParser.StrContext ctx) {
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

		return code;
	}

	@Override
	public CodeFragment visitFunc(kubojParser.FuncContext ctx) {
		return visit(ctx.function_call());
	}

	@Override
	public CodeFragment visitFunction_call(kubojParser.Function_callContext ctx) {
		CodeFragment code = new CodeFragment();

		String functionName = ctx.IDENTIFIER().getText();
		if (!functions.containsKey(functionName)) {
			System.err.println(String.format("Error: unknown function '%s'", functionName));
		}

		ArgumentListCodeFragment argumentList = (ArgumentListCodeFragment)visit(ctx.argument_list());
		code.addCode(argumentList);

		String retvalRegister = generateNewRegister();

		code.addCode(functions.get(functionName).getCallInstruction(retvalRegister, argumentList.getRegisters()));
		code.setRegister(retvalRegister);

		return code;
	}        

	@Override
	public CodeFragment visitArgument_list(kubojParser.Argument_listContext ctx) {
		ArgumentListCodeFragment code = new ArgumentListCodeFragment();

		for (kubojParser.ExpressionContext e : ctx.expression()) {
			CodeFragment expression = visit(e);
			code.addCode(expression);
			code.addRegister(expression.getRegister());
		}

		return (CodeFragment)code;
	}

	@Override
	public CodeFragment visitUna(kubojParser.UnaContext ctx) {
		System.out.println("Una");
		// TODO
		return new CodeFragment();
	}

	@Override
	public CodeFragment visitMul(kubojParser.MulContext ctx) {
		System.out.println("Mul");
		// TODO
		return new CodeFragment();
	}

	@Override
	public CodeFragment visitAdd(kubojParser.AddContext ctx) {
		System.out.println("Add");
		// TODO
		return new CodeFragment();
	}        

	@Override
	public CodeFragment visitMod(kubojParser.ModContext ctx) {
		System.out.println("Mod");
		// TODO
		return new CodeFragment();
	}

	@Override
	public CodeFragment visitPar(kubojParser.ParContext ctx) {
		System.out.println("Par");
		// TODO
		return new CodeFragment();
	}

	@Override
	public CodeFragment visitInd(kubojParser.IndContext ctx) {
		System.out.println("Ind");
		// TODO
		return new CodeFragment();
	}    

	@Override
	public CodeFragment visitVar(kubojParser.VarContext ctx) {
		System.out.println("Var");
		// TODO
		return new CodeFragment();
	}

	@Override
	public CodeFragment visitInt(kubojParser.IntContext ctx) {
        String value = ctx.INT().getText();
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        code.setRegister(register);
        code.addCode(String.format("%s = add i32 0, %s\n", register, value));
        return code;
	}
}
