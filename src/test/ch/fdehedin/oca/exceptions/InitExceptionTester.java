package ch.fdehedin.oca.exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import ch.fdehedin.oca.Lambdas.ArrayLambdaTester;

public class InitExceptionTester {
	private static final Logger log = Logger.getLogger(ArrayLambdaTester.class.getSimpleName());

	static int i = 0;

	// static {i = 10/0;}

	static {
		if (true) {
			throw new NullPointerException();
		}
	}

	public static void main(String[] args) {

	}

}
