public class DeclareVariableCodeFragment extends CodeFragment {
	private Variable variable = null;
	
	public DeclareVariableCodeFragment() {
		super();
	}
	
	public void setVariable(Variable v) {
		variable = v;
	}
	
	public Variable getVariable() {
		return variable;
	}
}
