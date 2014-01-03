public class CodeFragment {
	public static int TAB_WIDTH = 2;
	protected String code;
	protected String register;

	public CodeFragment() {
		this.code = "";
		this.register = null;
	}

	public void addCode(String code) {
		this.code += code;
	}

	public void addCode(CodeFragment fragment) {
		this.code += fragment.toString();
	}

	public String toString() {
		return this.code;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getRegister() {
		return this.register;
	}
	
	public void addTab() {
		String[] lines = code.split("\n");
		String[] tabbedLines = new String[lines.length];
		String tab = Utils.getTab(TAB_WIDTH);
		
		for (int i = 0; i < lines.length; i++) {
			tabbedLines[i] = tab + lines[i];
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tabbedLines.length; i++) {
			sb.append(tabbedLines[i]);
			sb.append("\n");
		}
		
		code = sb.toString();
	}
}
