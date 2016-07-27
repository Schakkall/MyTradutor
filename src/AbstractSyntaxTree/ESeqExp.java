package AbstractSyntaxTree;

import Abstractions.Memory;

public class ESeqExp extends Exp {
	public Stm stm;
	public Exp exp;
	
	public ESeqExp(Stm s, Exp e) {
		this.stm = s; 
		this.exp = e; 
	}
	
	public String toString() {
		return this.stm.toString() + "," + this.exp.toString();
	}
	
	public int evaluate(Memory mem) {
		this.stm.run(mem);
		return this.exp.evaluate(mem);
	}

}
