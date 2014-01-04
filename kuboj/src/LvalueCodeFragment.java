public class LvalueCodeFragment extends CodeFragment {
	private Variable variable;
	
	public LvalueCodeFragment() {
		super();
	}
	
	public void setVariable(Variable v) {
		this.variable = v;
	}
	
	public Variable getVariable() {
		return this.variable;
	}
}
