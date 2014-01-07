public class PIntVariable extends Variable {
	public PIntVariable(String name, String register) {
		super(name, register);
	}
	
	protected void setTypes() {
		this.llvmType = Variable.LLVM_PINT;
		this.myType = Variable.MY_PINT;		
	}
}
