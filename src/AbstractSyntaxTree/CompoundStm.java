package AbstractSyntaxTree;

import Abstractions.Memory;

public class CompoundStm extends Stm {
	public Stm stm1, stm2;
	public String stmDelimiter;
	
	public CompoundStm(Stm s1, Stm s2) { 
		this.stm1 = s1;
		this.stm2 = s2; 
		this.stmDelimiter = ";"; 
	}
	
	public String toString() {
		return this.stm1.toString() + this.stmDelimiter + "\n" + this.stm2.toString();
	}

	public void run(Memory mem) {
		this.stm1.run(mem);
		this.stm2.run(mem);
	}
}
