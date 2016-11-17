package ch.fdehedin.oca.Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;

import ch.fdehedin.oca.Lambdas.animals.Animal;

/**
 * @author FDN
 *
 */
/**
 * @author FDN
 *
 */
public class NoParamsTester {
	private static final Logger log = Logger.getLogger(NoParamsTester.class.getSimpleName());

	@Test
	public void test() {

		Printer printer = () -> log.info("test simple");
		Printer printer2 = () -> {
			log.info("test with brakets.");
		};

		printer.printSometing();
		printer2.printSometing();

		//another one:
		Runnable runner = ()->System.out.println("TEST");
		
	}

	/**
	 * interface for the lamdba function
	 *
	 */
	private interface Printer {
		public void printSometing();
	}
	
	
}
