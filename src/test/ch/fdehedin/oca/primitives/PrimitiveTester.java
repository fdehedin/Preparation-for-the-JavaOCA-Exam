package ch.fdehedin.oca.primitives;

import java.util.logging.Logger;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Assert;
import org.junit.Rule;

import java.util.logging.Logger;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import ch.fdehedin.oca.CoreJavaApis.StringPooler;

public class PrimitiveTester {
	@Rule
	public final ExpectedException exception = ExpectedException.none();

	private static final Logger log = Logger.getLogger(PrimitiveTester.class.getSimpleName());

	// normal single char..
	char ch1 = 'c';

	// normal single char..
	char chDigit = '2';

	// decimal int value..this is actually @
	char charDec = 64;

	// Unicode for uppercase Greek omega character
	char uniChar = '\u03A9';

	// hex actually a "!"
	char hex = 0x21;

	// Autoboxing
	Character ch2 = new Character('a');

	@Test
	public void testChar() {
		log.info("chars: " + hex + charDec + "  " + ch1 + uniChar + ch2);

		assertThat(hex, equalTo('!'));

		assertThat(Character.isDigit(chDigit), is(true));

		assertThat(Character.isLowerCase(ch2), is(true));

		assertThat(charDec, equalTo(new Character('@')));
	}

	@Test
	public void testInt() {
		int i = new Integer(1);
		i += -1;// will result 0
		assertThat(i == 0, is(true));

		i = Integer.parseInt("1");

		i = Integer.parseInt("-2");

		exception.expect(NumberFormatException.class);
		i = Integer.parseInt("1.0");

	}

	@Test
	public void compare() {
		int i = 10;
		log.info("i>=9:" + (i >= 11));
	}
}
