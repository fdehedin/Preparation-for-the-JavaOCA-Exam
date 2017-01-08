package ch.fdehedin.oca.ClassDesign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.fdehedin.oca.buildingblocks.ClassVariables;

public class ObjectCounterTester {
	private static final Logger logger = LoggerFactory.getLogger(ClassVariables.class);

	public ObjectCounterTester() {
		try {
			throw new MyException();
		} catch (Exception e) {

		}
	}
	
	public static void main(String[] args) {
		ObjectCounterTester a = new ObjectCounterTester();
		ObjectCounterTester b = new ObjectCounterTester();
		ObjectCounterTester c = b;
		
		logger.info("a: "+a.hashCode());
		logger.info("b: "+b.hashCode());
		logger.info("c: "+c.hashCode());
		
		int i = 0;
		JACK:
		 if (i > 3) break JACK; else i++;
	}

}

class MyException extends Exception {
}