import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;

public class Compiler {
    public static void main(String[] args) throws Exception {
    	System.out.println(String.format("Reading file '%s'", args[0]));
        InputStream is = new FileInputStream(args[0]);
        PrintWriter writer = new PrintWriter(args[1]);
        
        ANTLRInputStream input = new ANTLRInputStream(is);
        kubojLexer lexer = new kubojLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        kubojParser parser = new kubojParser(tokens);
        ParseTree tree = parser.init();
        
        CompilerVisitor eval = new CompilerVisitor();
        
        try {
	        CodeFragment code = eval.visit(tree);
	        
	        if (eval.error.equals("")) {
	            System.out.println(String.format("Writing to file '%s'", args[1]));
	            writer.write(code.toString());
	        } else {
	        	System.err.println(eval.error);
	        	Runtime.getRuntime().exit(1);
	        }
        } catch (Exception e) {
        	System.err.println(eval.error);
        	Runtime.getRuntime().exit(1);
        } finally {
        	writer.close();        	
        }
    }
}
