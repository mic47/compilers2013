package compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;
import parser.jazzikLexer;
import parser.jazzikParser;

public class Compiler {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        
        ANTLRInputStream input = new ANTLRInputStream(is);
        jazzikLexer lexer = new jazzikLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        jazzikParser parser = new jazzikParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ParserErrorListener());
        ParseTree tree = parser.init();
        
        if (lexer.failed || parser.getNumberOfSyntaxErrors() > 0) {
            if (lexer.failed)
                System.err.println(String.format("lexer failed with %d errors", lexer.errcount));
            if (parser.getNumberOfSyntaxErrors() > 0)
                System.err.println(String.format("parser failed with %d errors", parser.getNumberOfSyntaxErrors()));
            return;
        }

        CompilerVisitor eval = new CompilerVisitor(tokens);
        try {
            CodeFragment code = eval.visit(tree);
            if (!eval.failed) System.out.print(code.toString());
        }
        catch (Exception e) {
            System.err.print(e.getMessage());
        }
        if (eval.failed) {
            System.err.print(eval.errorStr);
            System.err.println(String.format("compiler failed with %d errors", eval.errcount));
            Runtime.getRuntime().exit(-1);
        }
    }
}