public class Variable {
    public String varType;
    public String name;
    public Integer arity = 0;
    
    public Variable(String name, String varType) {
    	this.name = name;
    	this.varType = varType;
    }
    
    public boolean isArray() {
    	return this.arity > 0;
    }
    
    public boolean isInt() {
    	return this.varType.equals("int");
    }
    
    public boolean isString() {
    	return this.varType.equals("string");
    }
    
    public String llvmType() {
    	if (isArray()) {
    		return "i32*";
    	}
    	else if (isInt()) {
    		return "i32";
    	}
    	else if (isString()) {
    		return "i8*";
    	}
    	
    	return "";
    }
}
