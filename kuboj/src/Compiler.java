import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Compiler {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream(args[0]);
        PrintWriter writer = new PrintWriter(args[1]);
        
        ANTLRInputStream input = new ANTLRInputStream(is);
        kubojLexer lexer = new kubojLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        kubojParser parser = new kubojParser(tokens);
        ParseTree tree = parser.init();
        
        CompilerVisitor eval = new CompilerVisitor(false);
        
        try {
	        CodeFragment code = eval.visit(tree);
	        
	        if (eval.error.equals("")) {
	            writer.write(code.toString());
	        } else {
	        	System.err.println(eval.error);
	        	Runtime.getRuntime().exit(1);
	        }
        } catch (Exception e) {
        	e.printStackTrace(new PrintStream(System.err));
        	System.err.println(eval.error);
        	Runtime.getRuntime().exit(1);
        } finally {
        	writer.close();        	
        }
    }
}
