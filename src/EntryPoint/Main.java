package EntryPoint;

import AbstractSyntaxTree.*;
import Abstractions.Memory;

/**
 * Exerc�cio de LFT - Aquecimento
 * 
 * @author  Simone Ris Santos Silva
 * @author  J. Eurique C. Ribeiro Jr
 * @author  Leonardo de Jesus Silva
 */

public class Main {
	public static void main(String[] args) {
		/* Programa descrito em prog
		 * x := (10 * 10);
		 * y := (10 + 10);
		 * print((x / y), (x - y))
		 */		
		Stm prog = 
				new CompoundStm( 
						new AssignStm("x", new TimesExp(new NumExp(10), new NumExp(10))),
						new CompoundStm(
								new AssignStm("y", new PlusExp(new NumExp(10), new NumExp(10))),	
								new PrintStm(
										new PairExpList(
												new DivExp(new IdExp("x"), new IdExp("y")),
												new SingleExpList(new MinusExp(new IdExp("x"), new IdExp("y")))
										)
								)
						)
				);
		System.out.println("O c�digo-fonte do seu programa �: ");
		System.out.println(prog.toString());
		System.out.println();
		
		System.out.println("O seu programa requisitou as seguintes impress�es no console: ");
		Memory mem = new Memory();
		prog.run(mem);
		System.out.println();
		
		System.out.println("Este � o estado da mem�ria ap�s a execu��o do programa: ");
		System.out.println(mem.toString());
		System.out.println();
		
		Exp exp = new TimesExp(new IdExp("x"), new NumExp(90));
		System.out.println("Este � o resultado da avalia��o da express�o " + exp.toString() + " baseado no estado atual da mem�ria: ");
		System.out.println(exp.evaluate(mem));
	}
}
