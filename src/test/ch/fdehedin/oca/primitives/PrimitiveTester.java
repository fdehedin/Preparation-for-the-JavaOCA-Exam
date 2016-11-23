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
	public void testInteger(){
		int a = Integer.MIN_VALUE;
		int b = +a;
		log.info("a: "+a +" , b: "+b);
	}
	
	@Test
	public void testCompare(){
		int a = 1;
		Integer b = new Integer(1);
		assertThat(a==b, is(true));
		assertThat(b.equals(a), is(true));
		
		byte c = 1;
		assertThat(c==b, is(true));
		assertThat(b.equals(c), is(false));
		
		long l  = 1L;
		assertThat(c==l, is(true));
		assertThat(b.equals(l), is(false));
		
		assertThat(1L == 1, is(true));
		
		assertThat(1.0F == 1, is(true));
		
		assertThat(1.0 == 1, is(true));
		
		Double dbl = 1.0;
		assertThat(dbl.equals(1), is(false));
		assertThat(dbl.equals(1.0F), is(false));
		assertThat(dbl.equals(1.0), is(true));
		
		short s = Short.MAX_VALUE;
		char charr = (char)s;
		log.info("charr:"+charr);
		
		int min = Integer.MIN_VALUE;
		log.info("min value:"+min);
		int min2 = -min;
		//log.info("min value:"+min);
		log.info("min2 value:"+min2);
		
		//FALSE! because they're pointing to a different object!!
		assertThat(new Integer(1) == new Integer(1), is(false));
		
		//compared with a primitive..
		assertThat(new Integer(1) == 1, is(true));
	
		//TRUE: using the autoboxed Integers equals function
		assertThat(new Integer(1).equals(new Integer(1)), is(true));
		assertThat(new Integer(1).equals(new Integer("1")), is(true));
		
		//False, not the same class..
		assertThat(new Integer(1).equals(new Long(1)), is(false));

		Boolean b1234 = Boolean.valueOf(true);
		
		
	}
}
