package ch.fdehedin.oca.OperatorsAndStatements;

import java.util.logging.Logger;

/**
 * @author fdehedin
 *
 */
public class IncrementDecrementMachine {

	private static final Logger log = Logger.getLogger(IncrementDecrementMachine.class.getSimpleName());

	int counter;
	
	public static void main(String[] args) {
		new IncrementDecrementMachine().incrementDecrement();
	}

	/**
	 * 
	 */
	public void incrementDecrement() {


		log.info("counter: "+counter);
		log.info("++counter: "+ ++counter);
		log.info("++counter: "+ ++counter);
		log.info("++counter: "+ ++counter);
		log.info("counter: "+ counter);
		log.info("counter++: "+ counter++);
		log.info("counter: "+ counter);
		
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		
		//result of y will be 4*5=20 / 4 = 5 + 2 = 7
		//result of x will be x+1 and 2 times -1 (but not for the operation because of post decrement) = 2
		
		log.info(String.format("x=%s, y=%s", x,y));
			
		
	}

	

}
