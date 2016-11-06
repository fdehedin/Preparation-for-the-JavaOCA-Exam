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
public class ManyParamsTester {
	private static final Logger log = Logger.getLogger(ManyParamsTester.class.getSimpleName());

	@Test
	public void test() {

		AnimalCreator creator = (String a, boolean b, boolean c) -> {
			return new Animal(a, b, c);
		};

		log.info("Animal: " + creator.getAnimalObject("dog", false, false));

	}

	/**
	 * interface for the lamdba function
	 *
	 */
	private interface AnimalCreator {
		public Animal getAnimalObject(String species, boolean canHop, boolean canSwim);
	}
}
