package AbstractSyntaxTree;

import Abstractions.Memory;

public class IdExp extends Exp {
	public String id;
	
	public IdExp(String i) { 
		this.id = i; 
	}
	
	public String toString() {
		return this.id;
	}

	public int evaluate(Memory mem) {
		return mem.lookup(this.id);
	}

}
