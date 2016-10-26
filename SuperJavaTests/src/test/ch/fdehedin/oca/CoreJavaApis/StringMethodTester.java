package ch.fdehedin.oca.CoreJavaApis;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Assert;
import org.junit.Rule;

import java.util.logging.Logger;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author juiceterry
 *
 */
public class StringMethodTester {

	private static final Logger log = Logger.getLogger(StringMethodTester.class.getSimpleName());

	String batman = "batman";

	@Test
	public void length() {

		assertThat(batman.length(), is(6));
	}

	@Test
	public void charAt() {

		// careful: charAt regurns a "char" type, which cannot be compared with
		// a "String"
		assertThat(batman.charAt(3), Matchers.equalTo('m'));
		assertThat(String.valueOf(batman.charAt(3)), Matchers.equalTo("m"));

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
		Assert.assertTrue(result);

	}

	@Test
	public void indexOf() {
		int result = 0;
		result = batman.indexOf(1);
		assertThat(result, is(-1));
		result = batman.indexOf('t');
		assertThat(result, is(2));
		result = batman.indexOf('t', 1); // start looking at pos 1
		assertThat(result, is(2));// but still keep the count from pos 0..
		result = batman.indexOf("t");
		assertThat(result, is(2));
		result = batman.indexOf("man");
		assertThat(result, is(3));
		result = batman.indexOf("man", 100);
		assertThat(result, is(-1));
	}

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	/**
	 * substring(start, end) or substring(start) .. as always: starting from 0
	 */
	@Test
	public void substring() {

		String result = "";
		result = batman.substring(0, 2);
		assertThat(result, equalTo("ba"));

		result = batman.substring(2, 2);
		assertThat(result, equalTo(""));

		result = batman.substring(batman.indexOf("m"));
		assertThat(result, equalTo("man"));

		result = batman.substring(1, batman.indexOf("m"));
		assertThat(result, equalTo("at"));

		result = batman.substring(0, batman.indexOf("m"));
		assertThat(result, equalTo("bat"));

		// -1
		exception.expect(StringIndexOutOfBoundsException.class);
		batman.substring(batman.indexOf("test"));

		// too long
		exception.expect(StringIndexOutOfBoundsException.class);
		batman.substring(100);

		// and before it started
		exception.expect(StringIndexOutOfBoundsException.class);
		batman.substring(2, 1);

	}

	@Test
	public void toLowerAndUpperCase() {

		String result = batman.toUpperCase();
		assertThat(result, equalTo("BATMAN"));

		result = batman.substring(0, 3).toUpperCase() + batman.substring(3, batman.length());
		assertThat(result, equalTo("BATman"));

		result = batman.substring(0, 3) + batman.substring(3).toUpperCase();
		assertThat(result, equalTo("batMAN"));

	}

	@Test
	public void equals() {

		String result = batman.toUpperCase();
		assertThat(result.equals("BATMAN"), is(true));

		result = batman.toUpperCase();
		assertThat(result.equals("batman"), is(false));

		result = batman.toUpperCase();
		assertThat(result.equalsIgnoreCase("batman"), is(true));

	}

	@Test
	public void startsAndEndsWith() {

		boolean result = batman.startsWith("ba");
		assertThat(result, is(true));

		result = batman.startsWith(batman.substring(0, 3));
		assertThat(result, is(true));

		result = batman.startsWith(batman.substring(1, 3));
		assertThat(result, is(false));

		result = batman.endsWith(batman.substring(1));
		assertThat(result, is(true));

		result = batman.endsWith(batman.substring(5, 6));// n
		assertThat(result, is(true));

	}

	@Test
	public void contains() {

		boolean result = batman.contains("man");
		assertThat(result, is(true));

		result = batman.contains("hero");
		assertThat(result, is(false));

	}

	@Test
	public void replace() {

		String result = batman.replace("bat", "bird");
		assertThat(result, equalTo("birdman"));

	}

	@Test
	public void trim() {

		String result = batman.trim();
		assertThat(result, equalTo("batman"));

		result = "Bat man".trim();
		assertThat(result, equalTo("Bat man"));

		result = "Bat          man".trim();
		assertThat(result.equals("Bat man"), is(false));

		result = "Bat man         ".trim();
		assertThat(result, equalTo("Bat man"));

		result = "Bat" + '\t' + "man".trim();
		assertThat(result, equalTo("Bat\tman"));

		result = "\tBat      ".trim();
		assertThat(result, equalTo("Bat"));
	}

	@Test
	public void chaining() {
		String a = "abc";
		String b = a.toUpperCase();

		b = b.replace("B",  "2").replace('C', '3');
		
		assertThat(a, equalTo("abc"));
		assertThat(b, equalTo("A23"));
		
	}
}
