package AbstractSyntaxTree;

import Abstractions.Memory;

public class MinusExp extends BinaryExp {
	public MinusExp(Exp l, Exp r) {
		super(l, r);
		this.op = "-";
	}
	
	public int evaluate(Memory mem) {
		return this.left.evaluate(mem) - this.right.evaluate(mem);
	}	
}
