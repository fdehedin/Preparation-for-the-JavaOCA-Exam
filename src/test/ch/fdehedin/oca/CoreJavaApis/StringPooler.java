package ch.fdehedin.oca.CoreJavaApis;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.logging.Logger;

import org.hamcrest.Matchers;
import org.junit.Test;

public class StringPooler {

	private static final Logger log = Logger.getLogger(StringPooler.class.getSimpleName());

	@Test
	public void testPool() {

		String s = "super string";

		int hcode = s.hashCode();

		assertThat(s.hashCode(), equalTo(hcode));

		String b = "super string";

		// same object! from the string pool!
		assertThat(b.hashCode(), equalTo(hcode));

		b = new String("super String");

		// now we have a new hashcode, since "new String.." creates a totally
		// new object in the String pool!
		assertThat(b.hashCode(), not(equalTo(hcode)));

	}
}
