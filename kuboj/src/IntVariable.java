public class IntVariable extends Variable {
	public IntVariable(String name, String register) {
		super(name, register);
	}
	
	protected void setTypes() {
		this.llvmType = Variable.LLVM_INT;
		this.myType = Variable.MY_INT;		
	}
}
