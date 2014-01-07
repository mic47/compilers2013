public class CodeFragment {
	private String code;
	private String register;
	private String varType;

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

	public void setVarType(String varType) {
		this.varType = varType;
	}
	
	public String getVarType() {
		return this.varType;
	}
	
	public void setRegister(String register) {
		this.register = register;
	}

	public String getRegister() {
		return this.register;
	}
	
    public boolean isInt() {
    	return this.varType.equals("int");
    }
    
    public boolean isString() {
    	return this.varType.equals("string");
    }
  
    public boolean isVoid() {
    	return this.varType.equals("void");
    }
    
}
