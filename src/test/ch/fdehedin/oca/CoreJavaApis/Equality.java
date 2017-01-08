package ch.fdehedin.oca.CoreJavaApis;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Assert;
import org.junit.Rule;

import java.util.logging.Logger;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import groovyjarjarasm.asm.commons.Method;

/**
 * @author juiceterry
 *
 */
public class Equality {

	private static final Logger log = Logger.getLogger(StringMethodTester.class.getSimpleName());

	@Test
	public void testStrings() {
		String a = "Test";
		String b = "Test"; // takes the same pool!
		assertThat(a == b, is(true));

		// still true, since no modification takes place=still the same object
		// from the pool!
		String c = "Test".trim();
		assertThat(a == c, is(true));

		// no a mod takes place, so java creates a new String object! so this
		// comparison is false..
		String d = "     Test".trim();
		assertThat(a == d, is(false));

		// also this comparison returns false, since we explicitly tell java to
		// create a new object.
		String e = new String("Test");
		String f = new String("Test");
		assertThat(e == f, is(false));
	}

	@Test
	public void equals() {
		Equality a = new Equality();
		Equality b = new Equality();
		Equality c = a;

		assertThat(a == b, is(false)); // both new object
		assertThat(a == c, is(true));// c is a reference to a

		assertThat(a.equals(b), is(false)); // Equality does not implement the
											// "equals" Method so returns
											// false..)

	}

}
