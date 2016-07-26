package AbstractSyntaxTree;

import Abstractions.Memory;

public abstract class Stm extends Ast{
	public abstract void run(Memory mem);
}
