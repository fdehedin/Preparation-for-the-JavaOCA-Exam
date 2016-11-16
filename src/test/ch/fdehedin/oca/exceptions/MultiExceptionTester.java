package ch.fdehedin.oca.exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import ch.fdehedin.oca.Lambdas.ArrayLambdaTester;

public class MultiExceptionTester {
	private static final Logger log = Logger.getLogger(ArrayLambdaTester.class.getSimpleName());

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	public void bad() {
		// try {
		eatCarrot();
		// this does not comile, since it is unreachable code!
		// eatCarrot is never throwing an exception: Custom Exception!
		// } catch (CustomException e) {
		// System.out.println("e:" + e.getMessage());
		// }
	}

	public void eatCarrot() {

	}

	class CustomException extends Exception {
	}

}
