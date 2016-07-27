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
		if (exps instanceof SingleExpList)  
			System.out.println(this.exps.evaluate(mem));
		else
			System.out.println(this.exps.evaluateAsList(mem).toString().replace("[", "").replace("]",""));
			
	}		
}
