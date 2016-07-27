package AbstractSyntaxTree;

import java.util.List;

import Abstractions.Memory;

public abstract class ExpList extends Ast{
	public abstract int evaluate(Memory mem);
	public abstract List<Integer> evaluateAsList(Memory mem);
}
