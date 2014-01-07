import java.util.ArrayList;

public class ArgumentListCodeFragment extends CodeFragment {
	private ArrayList<String> registers = new ArrayList<String>();
	
	public ArgumentListCodeFragment() {
		super();
	}
	
	public void addRegister(String register) {
		this.registers.add(register);
	}
	
	public ArrayList<String> getRegisters() {
		return this.registers;
	}
}
