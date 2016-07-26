package AbstractSyntaxTree;

public class PairExpList extends ExpList {
	public Exp head;
	public ExpList tail;
	
	public PairExpList(Exp e, ExpList l) { 
		this.head = e; 
		this.tail = l; 
	}
	
	public String toString() {
		return this.head.toString() + "," + this.tail.toString();
	};
}
