package AbstractSyntaxTree;

import Abstractions.Memory;

public class DivExp extends BinaryExp {
	public DivExp(Exp l, Exp r) {
		super(l, r);
		this.op = "/";
	}
	
	public int evaluate(Memory mem) {
		return this.left.evaluate(mem) / this.right.evaluate(mem);
	}	
}
