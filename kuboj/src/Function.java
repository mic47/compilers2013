import java.util.ArrayList;

public class Function {
	private String name;
	private String returnType;
	private ArrayList<String> parameterTypes = new ArrayList<String>(); 

	public Function(String name, String returnType, ArrayList<String> parameterTypes) {
		this.name = name;
		this.returnType = returnType;
		this.parameterTypes = parameterTypes;
	}
	
	public Function(String name, String returnType) {
		this.name = name;
		this.returnType = returnType;
	}
	
	public void setParameterTypes(ArrayList<String> pt) {
		this.parameterTypes = pt;
	}

	public String getName() {
		return this.name;
	}

	public String getReturnType() {
		return this.returnType;
	}

	public String getCallInstruction(String register, ArrayList<String> parameters) {
		StringBuilder instruction = new StringBuilder();

		instruction.append(String.format("%s = call %s @%s(", register, this.returnType, this.name));
		for (int i = 0; i < parameters.size(); i++) {
			if (i != 0) {
				instruction.append(", ");
			}
			instruction.append(parameterTypes.get(i) + " " + parameters.get(i));
		}
		instruction.append(")\n");

		return instruction.toString();
	}
	
	public String getLlvmDeclarationString() {
		StringBuilder paramString = new StringBuilder();
		for (int i = 0; i < parameterTypes.size(); i++) {
			if (i != 0) {
				paramString.append(", ");
			}
			paramString.append(parameterTypes.get(i));
		}
		return String.format("declare %s @%s(%s)\n", returnType, name, paramString.toString());
	}
	
	public String getLlvmDefinitionString(ArrayList<String> registers) {
		StringBuilder paramString = new StringBuilder();
		for (int i = 0; i < parameterTypes.size(); i++) {
			if (i != 0) {
				paramString.append(", ");
			}
			paramString.append(parameterTypes.get(i));
			paramString.append(" ");
			paramString.append(registers.get(i));
		}
		return String.format("define %s @%s(%s)", returnType, name, paramString.toString());		
	}
}
