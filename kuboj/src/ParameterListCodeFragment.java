import java.util.ArrayList;

public class ParameterListCodeFragment extends CodeFragment {
	private ArrayList<String> types = new ArrayList<String>();
	private ArrayList<String> registers = new ArrayList<String>();
	
	public ParameterListCodeFragment() {
		super();
	}
	
	public void addType(String t) {
		types.add(t);
	}
	
	public void addRegister(String r) {
		registers.add(r);
	}	
	
	public ArrayList<String> getTypes() {
		return types;
	}
	
	public ArrayList<String> getRegisters() {
		return registers;
	}
}
