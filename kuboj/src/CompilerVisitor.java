import java.util.HashMap;
import java.util.Map;

import org.stringtemplate.v4.*;

public class CompilerVisitor extends kubojBaseVisitor<CodeFragment> {
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
        		CodeFragment code = new CodeFragment();
        		code.addCode(
                        "declare i32 @writeint(i32)\n" + 
                        "declare i32 @writestr(i8*)\n"
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
        		System.out.println("Function_body - " + ctx.getText());
        		
	            CodeFragment body = visit(ctx.statement());
	            CodeFragment exp = visit(ctx.expression());
	
	            ST template = new ST(  
	                    "start:\n" + 
	                    "<body_code>" +
	                    "return:\n" +
	                    "<exp_code>" +
	                    "ret i32 0\n" + // TODO type ... struct ? 
	                    "}\n"
	            );
	            template.add("body_code", body);
	            template.add("exp_code", exp);
	
	            CodeFragment code = new CodeFragment();
	            code.addCode(template.render());
	            code.setRegister(exp.getRegister());
	            return code;       	
        }
        
        @Override
        public CodeFragment visitStr(kubojParser.StrContext ctx) {
        		System.out.println("Str - " + ctx.getText());

        		CodeFragment code = new CodeFragment();
        		String s = ctx.STRING().getText();
        		StringBuilder sb = new StringBuilder();
        	    for (byte b : s.getBytes()) {
        	        sb.append(String.format("\\%02X", b));
        	    }
        	    sb.append("\\00");
        	    
                ST template = new ST(
                        "<reg1> = alloca [<str_size> x i8]\n" + 
                        "store [<str_size> x i8] c\"<hex_str>\", [<str_size> x i8]* <reg1>\n" +
                        "<reg2> = getelementptr [<str_size> x i8]* <reg1>, i64 0, i64 0\n"
                );
                String reg1 = generateNewRegister();
                String reg2 = generateNewRegister();
                template.add("reg1", reg1);
                template.add("reg2", reg2);
                template.add("hex_str", sb.toString());
                template.add("str_size", s.length() + 1);
                
                code.setRegister(reg2);
                code.addCode(template.render());
        		
        		return code;
        }
        
        public CodeFragment visitExpression(kubojParser.ExpressionContext ctx) {
        		System.out.println("Expression - " + ctx.getText());
        		
        		return new CodeFragment();
        }
        
        @Override
        public CodeFragment visitStatement(kubojParser.StatementContext ctx) {
    		System.out.println("Statement - " + ctx.getText());
    		
    		return new CodeFragment();
        }  
        
        @Override
        public CodeFragment visitUna(kubojParser.UnaContext ctx) {
        	System.out.println("Una");
    		
    		return new CodeFragment();
        }
        
        @Override
        public CodeFragment visitMul(kubojParser.MulContext ctx) {
        	System.out.println("Mul");
    		
    		return new CodeFragment();
        }
        
        @Override
        public CodeFragment visitAdd(kubojParser.AddContext ctx) {
        	System.out.println("Add");
    		
    		return new CodeFragment();
        }        
        
        @Override
        public CodeFragment visitMod(kubojParser.ModContext ctx) {
        	System.out.println("Mod");
    		
    		return new CodeFragment();
        }
        
        @Override
        public CodeFragment visitPar(kubojParser.ParContext ctx) {
        	System.out.println("Par");
    		
    		return new CodeFragment();
        }
        
        @Override
        public CodeFragment visitInd(kubojParser.IndContext ctx) {
        	System.out.println("Ind");
    		
    		return new CodeFragment();
        }
        
        @Override
        public CodeFragment visitFunc(kubojParser.FuncContext ctx) {
        	System.out.println("Func");
    		
    		return new CodeFragment();
        }        
        
        @Override
        public CodeFragment visitVar(kubojParser.VarContext ctx) {
        	System.out.println("Var");
    		
    		return new CodeFragment();
        }
        
        @Override
        public CodeFragment visitInt(kubojParser.IntContext ctx) {
        	System.out.println("Int - " + ctx.getText());
    		
    		return new CodeFragment();
        }
}
