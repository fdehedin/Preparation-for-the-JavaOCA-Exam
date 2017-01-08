package ch.fdehedin.oca.exceptions;

import java.io.FileNotFoundException;
import java.util.logging.Logger;

import ch.fdehedin.oca.Lambdas.ArrayLambdaTester;

public class FinallyAndAfterTryCatchTester {
	private static final Logger log = Logger.getLogger(ArrayLambdaTester.class.getSimpleName());

	public static void main(String[] args) {
		try {
			fall();
		} catch (Exception e) {
			log.info("catch in calling method:" + e.getMessage());
		}
	}

	public static void fall() {
		try {
			log.info("zero div:" + 0 / 0);
		//	throw new FileNotFoundException();
		} catch (NullPointerException e) {
			log.info("catch:" + e);

		} finally {
			log.info("finally");

		}
		log.info("after try/catch");
	}

}
