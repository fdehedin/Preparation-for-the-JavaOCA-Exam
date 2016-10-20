package ch.fdehedin.oca.CoreJavaApis;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.hamcrest.Matchers;
import org.junit.Test;

public class StringMethodTester {

	private static final Logger log = Logger.getLogger(StringMethodTester.class.getSimpleName());

	String superhero = "batman";

	@Test
	public void length() {

		assertThat(superhero.length(), is(6));
	}

	@Test
	public void charAt() {

		// careful: charAt regurns a "char" type, which cannot be compared with
		// a "String"
		assertThat(superhero.charAt(3), Matchers.equalTo('m'));
		assertThat(String.valueOf(superhero.charAt(3)), Matchers.equalTo("m"));

		// some other tests:
		char b = 'b';
		String l = "l";
		byte in = 1;
		double dbl = 1.0;
		// in = (int)dbl;
		// if(b==l) // can't!

		boolean result = false;

		if (in == dbl) {
			// this works....
			result = true;
		}
		assertTrue(result);

	}
}
