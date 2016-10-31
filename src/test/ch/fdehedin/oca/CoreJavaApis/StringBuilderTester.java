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

	@Rule
	public final ExpectedException exception = ExpectedException.none();

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

			// alpha will remain the same object!
			alpha.append(current);

			assertThat(alpha.hashCode(), is(hashCodeRemember));
		}
	}

	@Test
	public void testSubstring(){
		StringBuilder sb = new StringBuilder("abcdefg");
		exception.expect(StringIndexOutOfBoundsException.class);
		sb.substring(5, 4);
	}
	
	@Test
	public void multipleReferences() {
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b.append("f");
		b = b.append("g").append('-').append(true);

		assertThat(a.toString(), equalTo("abcdefg-true"));
		assertThat(b.toString(), equalTo("abcdefg-true"));
		assertThat(a.hashCode(), is(b.hashCode()));
	}

	@Test
	public void testInsert() {
		StringBuilder a = new StringBuilder("abcdefg");
		a.insert(2, "-");

		assertThat(a.toString(), equalTo("ab-cdefg"));
		assertThat(a.toString(), not(equalTo("abc-defg")));

		// this will insert the - BEFORE the char at position 5;
		a = new StringBuilder("012345");
		a.insert(5, "-");
		assertThat(a.toString(), equalTo("01234-5"));

		// this will insert the - at the END;
		a = new StringBuilder("012345");
		a.insert(6, "-");
		assertThat(a.toString(), equalTo("012345-"));

		// will return error, since 7 is out of bounds;
		a = new StringBuilder("012345");
		exception.expect(StringIndexOutOfBoundsException.class);
		a.insert(7, "-");
		assertThat(a.toString(), equalTo("012345-"));

	}

	@Test
	public void testDelete() {
		StringBuilder a = new StringBuilder("abcdefg");
		a.delete(2, 3);

		assertThat(a.toString(), equalTo("abdefg"));

		a = new StringBuilder("abcdefg");
		a.delete(2, 4);

		assertThat(a.toString(), equalTo("abefg"));

		a = new StringBuilder("abcdefg");
		a.deleteCharAt(1);

		assertThat(a.toString(), equalTo("acdefg"));

	}
	@Test
	public void testReverse() {
		StringBuilder a = new StringBuilder("abcdefg");
		a.reverse();

		assertThat(a.toString(), equalTo("gfedcba"));


	}
}
