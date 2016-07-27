package AbstractSyntaxTree;

import java.util.ArrayList;
import java.util.List;

import Abstractions.Memory;

public class PairExpList extends ExpList {
	public Exp head;
	public ExpList tail;
	
	public PairExpList(Exp e, ExpList l) { 
		this.head = e; 
		this.tail = l; 
	}
	
	public String toString() {
		return this.head.toString() + "," + this.tail.toString();
	}
	
	public int evaluate(Memory mem) {
		throw new UnsupportedOperationException("Not Implemented");
	};
	
	public List<Integer> evaluateAsList(Memory mem) {
		List<Integer> lst =  new ArrayList<Integer>();
		lst.add(this.head.evaluate(mem));
		lst.addAll(this.tail.evaluateAsList(mem));
		return lst;
	}	
}
