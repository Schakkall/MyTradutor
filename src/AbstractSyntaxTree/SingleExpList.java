package AbstractSyntaxTree;

import java.util.ArrayList;
import java.util.List;

import Abstractions.Memory;

public class SingleExpList extends ExpList {
	public Exp exp;
	
	public SingleExpList(Exp e) { 
		exp = e; 
	}
	
	public String toString() {
		return this.exp.toString();
	}


	public int evaluate(Memory mem) {
		return this.exp.evaluate(mem);
	}

	public List<Integer> evaluateAsList(Memory mem) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(this.exp.evaluate(mem)); 
		return lst;
	}	
}
