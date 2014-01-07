import java.util.ArrayList;

public class Function {
    public String returnType;
    public String name;
    public ArrayList<Variable> args = new ArrayList<Variable>();
    public String code;
    
    public Function(String name, String returnType) {
    	this.name = name;
    	this.returnType = returnType;
    }
    
    public boolean returnsVoid() {
    	return this.returnType.equals("void");
    }
    
    public boolean returnsInt() {
    	return this.returnType.equals("int");
    }
    
    public boolean returnsString() {
    	return this.returnType.equals("string");
    }
    
    public boolean inGlobalScope() {
    	return this.name.equals("main");
    }
}
