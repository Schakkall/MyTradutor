package EntryPoint;

import java.util.HashMap;

import AbstractSyntaxTree.*;
import Abstractions.Memory;

/**
 * Exercício de LFT - Aquecimento
 * 
 * @author  Simone Ris Santos Silva
 * @author  J. Eurique C. Ribeiro Jr
 * @author  Leonardo de Jesus Silva
 */

public class Main {
	public static void main(String[] args) {
		Stm prog = new CompoundStm( new AssignStm("x", new PlusExp(new NumExp(10), new NumExp(10))), 
				new AssignStm("y", new TimesExp(new NumExp(10), new NumExp(10))));
		System.out.println(prog.toString());
		
		Memory mem = new Memory(new HashMap<String, Integer>());
		prog.run(mem);
		System.out.println(mem.toString());
		
		Exp exp = new TimesExp(new IdExp("x"), new NumExp(90));
		System.out.println(exp.evaluate(mem));
	}
}
