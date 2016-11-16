package ch.fdehedin.oca.exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import ch.fdehedin.oca.Lambdas.ArrayLambdaTester;

public class FurtherExceptionTester {
	private static final Logger log = Logger.getLogger(ArrayLambdaTester.class.getSimpleName());

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void test() {
		FileReader reader = null;
		try {
			reader = read();
		} catch (IOException e) {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException innere) {

			}
		}
	}

	private static FileReader read() throws IOException {
		return null;
	}

}
