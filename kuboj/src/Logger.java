import java.io.PrintWriter;

import org.antlr.v4.runtime.ParserRuleContext;

public class Logger {
	public static final int TAB_WIDTH = 2;
	private int current_tab = 0;
	private PrintWriter out = new PrintWriter(System.out, true);
	private PrintWriter err = new PrintWriter(System.err, true);
	
	public Logger(ParserRuleContext ctx) {
		String callingFunction = Thread.currentThread().getStackTrace()[2].getMethodName();
		log(String.format("%s -> %s", callingFunction, ctx.getText()));
		tab();
	}
	
	public void writeFunction(ParserRuleContext ctx) {
		String callingFunction = Thread.currentThread().getStackTrace()[2].getMethodName();
		log(String.format("%s -> %s", callingFunction, ctx.getText()));		
	}
	
	public void tab() {
		current_tab += TAB_WIDTH;
	}
	
	public void untab() {
		if (current_tab >= TAB_WIDTH) { 
			current_tab -= TAB_WIDTH;
		}
	}
	
	public void log(String s, Object... args) {
		out.println(String.format(getTab() + s, args));
	}
	
	public void error(String s, Object... args) {
		err.println(String.format(getTab() + "Error: " + s, args));
	}
	
	public void logCode(CodeFragment code) {
		log("------code------");
		String codeStr = code.code.replace("%", "%%");
		log(codeStr.substring(0, codeStr.length() - 1));
		log("------code------");
	}
	
	private String getTab() {
		String tab = "";
		for (int i = 0; i < current_tab; i++) {
			tab += " ";
		}
		return tab;
	}
}
