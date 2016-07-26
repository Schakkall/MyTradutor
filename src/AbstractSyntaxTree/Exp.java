package AbstractSyntaxTree;

import Abstractions.Memory;

public abstract class Exp extends Ast {
	public abstract int evaluate(Memory mem);
}
