package AbstractSyntaxTree;

import Abstractions.Memory;

public class PlusExp extends BinaryExp {
	public PlusExp(Exp l, Exp r) {
		super(l, r);
		this.op = "+";
	}
	
	public int evaluate(Memory mem) {
		return this.left.evaluate(mem) + this.right.evaluate(mem);
	}	
}
