package ch.fdehedin.oca.Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;

/**
 * @author FDN
 *
 */
/**
 * @author FDN
 *
 */
public class GreetingLamdbaTester {
	private static final Logger log = Logger.getLogger(GreetingLamdbaTester.class.getSimpleName());

	@Test
	public void testGreeting() {

		List<String> namesToGreet = new ArrayList<String>();
		namesToGreet.add("Karing");
		namesToGreet.add("Manu");
		namesToGreet.add("Humbert");

		Greeter ordinalGreeter = (String a) -> log.info("hoi " + a);
		Greeter formalGreeter = a -> log.info("grüezi " + a);

		for (String name : namesToGreet)
			ordinalGreeter.greet(name);

		for (String name : namesToGreet)
			formalGreeter.greet(name);

	}

	/**
	 * interface for the lamdba function
	 *
	 */
	private interface Greeter {
		public void greet(String name);
	}
}
