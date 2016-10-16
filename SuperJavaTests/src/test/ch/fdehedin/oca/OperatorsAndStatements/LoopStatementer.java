package ch.fdehedin.oca.OperatorsAndStatements;

import java.util.logging.Logger;

import org.junit.Test;

public class LoopStatementer {

	private static final Logger log = Logger.getLogger(LoopStatementer.class.getSimpleName());

	@Test
	public void whileLoop(){
		int bitesOfCheese = 20;
		int roomInBelly = 10;
		
		while (bitesOfCheese > 0 && roomInBelly > 0){
			bitesOfCheese--;
			roomInBelly--;
		}
		log.info(String.format("the mouse left %d bites left..", bitesOfCheese));
	}
	
	
}
