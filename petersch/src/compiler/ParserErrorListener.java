package compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Nullable;
 
import java.util.*;
 
public class ParserErrorListener extends BaseErrorListener {
    private boolean failed = false;
    
    public boolean failed() { return this.failed; }
    
    @Override
    public void syntaxError(
            Recognizer<?, ?> recognizer,
            Object offendingSymbol,
            int line, 
            int charpos,
            String msg,
            RecognitionException e
    ) {
        String symbol = offendingSymbol.toString().replaceAll("\\[[^\']*\'|\'[^\']*\\]", "\'");
        //List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        //Collections.reverse(stack);
        //System.err.println("stack: " + stack);
        System.err.println("line " + line + ":" + charpos + " at " + symbol + ": " + msg);
        failed = true;
    }
}
