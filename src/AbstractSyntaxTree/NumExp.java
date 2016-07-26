package AbstractSyntaxTree;

import Abstractions.Memory;

public class NumExp extends Exp {
	public int num;
	
	public NumExp(int n) { 
		this.num = n; 
	}
	
	public String toString() {
		return Integer.toString(this.num);
	}
	
	public int evaluate(Memory mem) {
		return this.num;
	}	
}
