package AbstractSyntaxTree;

public abstract class BinaryExp extends Exp {
	public Exp left, right;
	public String op;

	public BinaryExp(Exp l, Exp r) {
		this.left = l; 
		this.right = r; 		
	}
	
	public String toString() {
		return "("+ this.left.toString() + " " + this.op + " " + this.right.toString() + ")";
	};	
}
