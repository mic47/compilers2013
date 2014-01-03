import java.util.ArrayList;

public class Function {
	private String name;
	private String returnType;
	private ArrayList<String> argumentTypes = new ArrayList<String>(); 

	public Function(String name, String returnType, ArrayList<String> argumentTypes) {
		this.name = name;
		this.returnType = returnType;
		this.argumentTypes = argumentTypes;
	}

	public String getName() {
		return this.name;
	}

	public String getReturnType() {
		return this.returnType;
	}

	public String getCallInstruction(String register, ArrayList<String> arguments) {
		StringBuilder instruction = new StringBuilder();

		instruction.append(String.format("%s = call %s @%s(", register, this.returnType, this.name));
		for (int i = 0; i < arguments.size(); i++) {
			if (i != 0) {
				instruction.append(", ");
			}
			instruction.append(argumentTypes.get(i) + " " + arguments.get(i));
		}
		instruction.append(")\n");

		return instruction.toString();
	}
}
