package ch.fdehedin.oca.CoreJavaApis;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class StringTester {

	@Test
	public void testNull() {
		String s = null;
		s = s + "TEST";
		assertThat(s.equals("nullTEST"), is(true));
		assertThat(s, equalTo("nullTEST"));
		assertThat(s == "nullTEST", is(false));

	}

	@Test
	public void testCompare() {
		String s1 = "Hello";
		String s2 = "H" + "ello";
		assertThat(s1 == s2, is(true));
		assertThat(s1.equals(s2), is(true));

		String s3 = "H";
		s3 = s3.concat("ello");
		String s4 = "ello";

		// FALSE FALSE
		assertThat(s1 == s3, is(false));

		// TRUE TRUE
		assertThat(s1 == s3.intern(), is(true));

		assertThat(s1 + s4 == s1, is(false));

		assertThat((s1 + s4).intern() == s1.intern(), is(false));

	}

}
