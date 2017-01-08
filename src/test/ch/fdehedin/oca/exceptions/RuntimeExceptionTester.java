package ch.fdehedin.oca.exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.time.DateTimeException;
import java.util.logging.Logger;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import ch.fdehedin.oca.Lambdas.ArrayLambdaTester;

public class RuntimeExceptionTester {
	private static final Logger log = Logger.getLogger(ArrayLambdaTester.class.getSimpleName());

	//this will throw an ExceptionInIntitializerError
	//static{
	//	int i = 1 / 0;
	//}
	
	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void testNumberFormatException() {
		exception.expect(NumberFormatException.class);
		int i = Integer.parseInt("abc");
	}

	@Test
	public void testClassCastException() {
		Object i = 1.0;
		exception.expect(ClassCastException.class);
		log.info("aaaa:" + (String) i);
	}

	@Test
	public void testArrayIndexOutOfBoundsException() {
		exception.expect(ArrayIndexOutOfBoundsException.class);
		Integer[] i = new Integer[0];
		log.info("i: " + i[0]);
	}

	@Test
	public void testArithmeticException() {
		exception.expect(ArithmeticException.class);
		int i = 1 / 0;
	}

	@Test
	public void testFinallyException() throws Exception {
		exception.expect(IOException.class);
		throwException();

	}

	private void throwException() throws Exception {
		try {
			throw new NullPointerException();
		} catch (RuntimeException e) {
			throw new RuntimeException();
		} finally {
			// This Exception will be thrown!
			throw new IOException();
		}
	}

}
