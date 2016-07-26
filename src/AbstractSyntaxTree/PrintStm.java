package AbstractSyntaxTree;

import Abstractions.Memory;

public class PrintStm extends Stm {
	public ExpList exps;
	
	public PrintStm(ExpList es) { 
		this.exps = es; 
	}	
	
	public String toString() {
		return "print(" + this.exps.toString() + ")";
	}
	
	public void run(Memory mem) {
		throw new UnsupportedOperationException();
	}
	
		
}
