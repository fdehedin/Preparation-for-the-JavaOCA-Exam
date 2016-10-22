package ch.fdehedin.oca.CoreJavaApis;

import java.util.logging.Logger;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Assert;
import org.junit.Rule;

import java.util.logging.Logger;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringBuilderTester {

	private static final Logger log = Logger.getLogger(StringPooler.class.getSimpleName());

	@Test
	public void testImmutableString() {
		String alpha = "";
		int hashCodeRemember = alpha.hashCode();
		for (char current = 'a'; current <= 'z'; current++) {
			hashCodeRemember = alpha.hashCode();
			log.info("hashcode of alpha string:" + hashCodeRemember);

			// this will generate always a completely new object! and previous
			// one is eligle for garbage collection.. unefficient..
			alpha += current;

			assertThat(alpha.hashCode(), not(is(hashCodeRemember)));
		}
	}

	@Test
	public void testMutableStringBuilder() {
		StringBuilder alpha = new StringBuilder("");
		int hashCodeRemember = alpha.hashCode();
		for (char current = 'a'; current <= 'z'; current++) {
			hashCodeRemember = alpha.hashCode();
			log.info("hashcode of alpha stringbuilder:" + hashCodeRemember);

			//alpha will remain the same object!
			alpha.append(current);

			assertThat(alpha.hashCode(), is(hashCodeRemember));
		}
	}
}
