package AbstractSyntaxTree;

import Abstractions.Memory;

public class AssignStm extends Stm {
	public String id;
	public Exp exp;
	
	public AssignStm(String i, Exp e) { 
		this.id = i; 
		this.exp = e; 
	}
	
	public String toString() {
		return this.id.toString() + " := "	+ this.exp.toString();	
	}

	public void run(Memory mem) {
		mem.update(this.id, this.exp.evaluate(mem));
	}	
}