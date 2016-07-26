package AbstractSyntaxTree;

public class SingleExpList extends ExpList {
	public Exp exp;
	
	public SingleExpList(Exp e) { 
		exp = e; 
	}
	
	public String toString() {
		return this.exp.toString();
	}
}
