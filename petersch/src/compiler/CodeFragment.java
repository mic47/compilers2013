package compiler;

public class CodeFragment {
    private String code;
    private String global;
    private String register;
    private String funcargs;
    private String signature;

    public CodeFragment() {
        this.code = "";
        this.global = "";
        this.funcargs = "";
        this.signature = "";
        this.register = null;
    }

    public void addCode(String code) {
        this.code += code;
    }

    public void addCode(CodeFragment fragment) {
        this.code += fragment.code;
    }

    public void addGlobal(String code) {
        this.global += code;
    }

    public void addGlobal(CodeFragment fragment) {
        this.global += fragment.global;
    }

    public void addFragment(CodeFragment fragment) {
        this.global += fragment.global;
        this.code += fragment.code;
        addFuncArg(fragment.funcargs);
        addSignature(fragment.signature);
    }

    public String toString() {
        return this.global + this.code;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getRegister() {
        return this.register;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getGlobal() {
        return global;
    }
    
    public void addFuncArg(String arg) {
        if (!this.funcargs.isEmpty())
            this.funcargs += ", ";
        this.funcargs += arg;
    }
    
    public String getFuncArgs() {
        return funcargs;
    }
    
    public void addSignature(String arg) {
        if (!this.signature.isEmpty())
            this.signature += ", ";
        this.signature += arg;
    }
    
    public String getSignature() {
        return signature;
    }
}
