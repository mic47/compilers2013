
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.gui.*;

import java.util.*;
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
        
        //new TreeViewer(Arrays.asList(parser.getRuleNames()), tree).open();

        CompilerVisitor eval = new CompilerVisitor();
        CodeFragment code = eval.visit(tree);
        
        System.out.println(String.format("Writing to file '%s'", args[1]));
        writer.write(code.toString());
        writer.close();
    }
}
