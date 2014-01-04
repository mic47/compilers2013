abstract public class Variable {
	public static final String LLVM_INT = "i32";
	public static final String LLVM_PINT = "i32*";
	public static final String MY_INT = "int";
	public static final String MY_PINT = "int[]";
	
	protected String name;
	protected String register;
	protected String llvmType;
	protected String myType;
	
	public Variable(String name, String register) {
		this.name = name;
		this.register = register;
		setTypes();
	}
	
	public void setRegister(String register) {
		this.register = register;
	}
	
	public String getRegister() {
		return this.register;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getLlvmType() {
		return this.llvmType;
	}
	
	public String getMyType() {
		return this.myType;
	}
	
	public String toString() {
		return String.format("<%s %s %s>", myType, name, register.replace("%", "%%"));
	}
	
	public boolean isInt() {
		return getMyType().equals(MY_INT);
	}
	
	public boolean isPInt() {
		return getMyType().equals(MY_PINT);
	}
	
	abstract protected void setTypes();
}
