package ch.fdehedin.oca.CoreJavaApis;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.hamcrest.Matcher;
import org.hamcrest.collection.IsArrayWithSize;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import ch.fdehedin.util.TestUtil;

/**
 * @author juiceterry
 *
 */
public class WrapperAndAutoboxer {

	private static final Logger log = Logger.getLogger(WrapperAndAutoboxer.class.getSimpleName());

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void wrap() {
		Boolean b = new Boolean(true);
		boolean b2 = new Boolean(true);

		Byte by = new Byte((byte) 1);
		Short s = new Short((short) 2);
		Integer i = new Integer(1);
		Long l = new Long(1L);
		Float fl = new Float(1.0);
		Double dbl = new Double(1.0);
		char c = new Character('d');

	}

	@Test
	public void parse() {

		Boolean.parseBoolean("TrUe");// case doen't matter
		Integer.parseInt("234"); // returns an "int" primitive

		Byte.parseByte("1");// works

		// in order to parse to wrapper class, simplye use "valueOf"
		Integer wrapper = Integer.valueOf("456"); // returns an Integer Wrapper
													// Object

		exception.expect(NumberFormatException.class);
		Double.parseDouble("abc");// throws exception!

		// char has no parse function..

	}

	@Test
	public void autobox() {

		List<Double> arr = new ArrayList<Double>();
		arr.add(1.0); // actually adding a primitive, but java autoboxes the
						// added value..

		double one = 1.0;
		assertThat(arr.get(0), is(one)); // value in array is Double, but
											// compared to primitive double it's
											// still the same!
		arr.add(null);
		arr.add(null);
		arr.remove(null);
		assertThat(arr.size(), is(2));
		arr.remove(null);
		assertThat(arr.size(), is(1));

		List<Integer> arrInts = new ArrayList<>();
		arrInts.add(2);
		arrInts.add(3);
		arrInts.add(4);
		arrInts.remove(1); // removes actually the pos 1
		assertThat(arrInts.get(0), is(2));
		assertThat(arrInts.get(1), is(4));

		arrInts.add(1, 3);
		arrInts.remove(Integer.valueOf(3));// now we remove the Integer object 3
		assertThat(arrInts.get(0), is(2));
		assertThat(arrInts.get(1), is(4));

	}
}
