import java.io.PrintWriter;

import org.antlr.v4.runtime.ParserRuleContext;

public class Logger {
	public static final int TAB_WIDTH = 4;
	private int current_tab = 0;
	private PrintWriter out = new PrintWriter(System.out, true);
	
	public Logger() {
	}
	
	public void tab(ParserRuleContext ctx) {
		current_tab += TAB_WIDTH;
		writeFunction(ctx);
	}
	
	public void untab() {
		if (current_tab >= TAB_WIDTH) { 
			current_tab -= TAB_WIDTH;
		}
	}
	
	public void log(String s, Object... args) {
		out.println(String.format(getTab() + s, args));
	}
	
	public void logCode(CodeFragment code) {
		if (code.code.length() == 0) {
			return;
		}
		log("------code------");
		String codeStr = code.code.replace("%", "%%");
		codeStr = codeStr.substring(0, codeStr.length() - 1);
		String lines[] = codeStr.split("\n");
		for (int i = 0; i < lines.length; i++) {
			log(lines[i]);
		}
		
		log("------code------");
	}
	
	public void writeFunction(ParserRuleContext ctx) {
		String callingFunction = Thread.currentThread().getStackTrace()[3].getMethodName();
		log(String.format("%s -> %s", callingFunction, ctx.getText().replace("%", "%%")));		
	}
	
	private String getTab() {
		String tab = "";
		for (int i = 0; i < current_tab; i++) {
			tab += " ";
		}
		return tab;
	}
}
