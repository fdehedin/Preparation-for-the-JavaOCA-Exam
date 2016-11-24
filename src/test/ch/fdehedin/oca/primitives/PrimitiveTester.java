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

	@Test
	public void testInteger() {
		int a = Integer.MIN_VALUE;
		int b = +a;
		log.info("a: " + a + " , b: " + b);
	}

	@Test
	public void testCompare() {
		int a = 1;
		Integer b = new Integer(1);
		assertThat(a == b, is(true));
		assertThat(b.equals(a), is(true));

		byte c = 1;
		assertThat(c == b, is(true));
		assertThat(b.equals(c), is(false));

		long l = 1L;
		assertThat(c == l, is(true));
		assertThat(b.equals(l), is(false));

		assertThat(1L == 1, is(true));

		assertThat(1.0F == 1, is(true));

		assertThat(1.0 == 1, is(true));

		Double dbl = 1.0;
		assertThat(dbl.equals(1), is(false));
		assertThat(dbl.equals(1.0F), is(false));
		assertThat(dbl.equals(1.0), is(true));

		short s = Short.MAX_VALUE;
		char charr = (char) s;
		log.info("charr:" + charr);

		int min = Integer.MIN_VALUE;
		log.info("min value:" + min);
		int min2 = -min;
		// log.info("min value:"+min);
		log.info("min2 value:" + min2);

		// FALSE! because they're pointing to a different object!!
		assertThat(new Integer(1) == new Integer(1), is(false));

		// compared with a primitive..
		assertThat(new Integer(1) == 1, is(true));

		// TRUE: using the autoboxed Integers equals function
		assertThat(new Integer(1).equals(new Integer(1)), is(true));
		assertThat(new Integer(1).equals(new Integer("1")), is(true));

		// False, not the same class..
		assertThat(new Integer(1).equals(new Long(1)), is(false));

		Boolean b1234 = Boolean.valueOf(true);

	}

	@Test
	public void byteCasting() {
		// byte can be -128 to 127, 8bit
		byte b = 10;
		assertThat(b == 10, is(true));

		int i10 = 10;
	//	byte bte = i10;
		
		short s = b;
		assertThat(s == b, is(true));
		assertThat(s == 10, is(true));

		int i = b;
		assertThat(i == b, is(true));
		assertThat(i == 10, is(true));
		assertThat(i == 10.0, is(true));

		char c = (char) b;
		log.info("c:" + c);
		assertThat(c == b, is(true));

		long l = b;
		assertThat(l == b, is(true));

		float f = b;
		assertThat(f == b, is(true));

		double d = b;
		assertThat(d == b, is(true));
		assertThat(d == 10, is(true));
		assertThat(d == 10.0, is(true));
	}

	@Test
	public void shortCasting() {
		// short can be -32K to +32K, 16Bit
		short s = 10;
		assertThat(s == 10, is(true));

		// this is not possible!
		// byte b = s;
		// We need an explizit cast!
		byte b = (byte) s;
		assertThat(b == 10, is(true));
		short sBIG = 32000;
		byte bSmall = (byte) sBIG;
		log.info("converted 32K short into byte: " + bSmall);
		assertThat(bSmall == 0, is(true));

		int i = s;
		assertThat(i == s, is(true));
		assertThat(i == 10, is(true));
		assertThat(i == 10.0, is(true));

		long l = s;
		assertThat(l == s, is(true));

		float f = s;
		assertThat(f == s, is(true));

		double d = s;
		assertThat(d == s, is(true));
		assertThat(d == 10, is(true));
		assertThat(d == 10.0, is(true));
	}

	@Test
	public void intCasting() {
		// int can be -2Mia until 2Mia , 32bit
		int i = 10;
		assertThat(i == 10, is(true));
		assertThat(i == 10.0, is(true));

		char c = (char) i;
		log.info("c:" + c);
		assertThat(c == i, is(true));

		// can't, we need to cast!
		// short s = i;
		short s = (short) i;
		assertThat(s == 10, is(true));

		double d = i;
		assertThat(d == 10, is(true));

	}

	@Test
	public void carCasting() {
		// '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535
		// inclusive).

		char c = 10;// line feed

		// can't, we need to cast
		// byte b = c;
		byte b = (byte) c;
		assertThat(b == 10, is(true));

		short s = (short) c;
		assertThat(b == 10, is(true));
	}

	@Test
	public void charTest() {

		char s = 's';
		String es = "es";
		String e = "e";
		e = e + s;

		System.out.println(es == e);

	}
}
