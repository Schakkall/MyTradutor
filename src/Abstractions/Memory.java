package Abstractions;

import java.util.HashMap;
import java.util.Map;

public class Memory {
	public Map<String, Integer> mem;
	
	public Memory(Map<String, Integer> mem){
		this.mem = mem;
	}

	public Memory(){
		this.mem = new HashMap<String, Integer>();
	}
	
	public void update(String id, int value){
		this.mem.put(id, value);
	}
	
	public Integer lookup(String id){
		return this.mem.get(id);
	}
	
	public String toString() {
		return this.mem.toString();
	}
}
