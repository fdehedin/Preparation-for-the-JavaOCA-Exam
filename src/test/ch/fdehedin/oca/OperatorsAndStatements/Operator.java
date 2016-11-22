package ch.fdehedin.oca.OperatorsAndStatements;

import java.util.logging.Logger;

import org.junit.Test;

import static ch.fdehedin.util.HamcrestLoggerMatcher.log;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import ch.fdehedin.util.Util;

/**
 * @author fdehedin
 *
 */
public class Operator {

	private static final Logger log = Logger.getLogger(Operator.class.getSimpleName());

	public static void main(String[] args) {
		new Operator().operate();
		new Operator().compountOperate();
		new Operator().logicalOperate();
	}

	/**
	 * a quick test of number values and their behaviours
	 */
	public void operate() {
		int x = (int) 1.9;
		short y = (short) 1921222999393939.0;
		int z = (int) 9f;
		long t = (long) 898989;
		short u = (short) (x + z); // x and z will first get integers before
									// they get casted back to short

		log.info(String.format("x=%s", x));
		log.info(String.format("y=%s", y));
		log.info(String.format("z=%s", z));
		log.info(String.format("t=%s", t));
		log.info(String.format("u=%s", u));

	}

	@Test
	public void compountOperate() {
		int x = 2, z = 3;
		x *= z; // same like x = x * z, but just more handy..
		int result1 = x;
		x = 2;
		x = x * z;
		int result2 = x;

		assertThat("checking x=x*z and also x*=z, which should both result in 6", result1, log(equalTo(result2)));

		long n = 10;
		int y = 5;
		// y = y*n; does not compile (int cast missing).
		y *= n; // this works..

		log.info(String.format("y is first casted to long for the calculation, then back to: %s", Util.getType(y)));
		assertThat(Util.getType(y), log(equalTo(Integer.class.getName())));

		long o = 5;
		long s = (o = 7); // this also returns 7... so s is also 7;
		log.info(String.format("o is %s", o));
		log.info(String.format("s is %s", s));

		assertThat(s, log(equalTo(7L)));

	}

	@Test
	public void logicalOperate() {
		boolean x = true;
		boolean z = false;

		// both have to be true
		log.info(String.format("x & z = %s", x & z));
		assertThat(x & z, log(is(false)));

		// one of both has to be true
		log.info(String.format("x | z = %s", x | z));
		assertThat(x | z, log(is(true)));

		// both have to be different
		log.info(String.format("x ^ z = %s", x ^ z));
		assertThat(x ^ z, log(is(true)));

	}

	@Test
	public void testInstanceOf() {
		int a = 1;
		int[] abc = { 0, 1, 2, 3 };
		Double b = new Double(1.0);
		Double c = new Double(a);

		// CANNOT! int is a primitive, thus not an object!
		// assertThat(a instanceof Object, log(is(true)));

		// Arrays of primitives ARE Object..
		assertThat(abc instanceof Object, log(is(true)));
		assertThat(b instanceof Object, log(is(true)));
		assertThat(c instanceof Object, log(is(true)));
		assertThat("STRING OBJECT" instanceof Object, log(is(true)));

		// this is octal! so it will be 43
		assertThat(053, log(is(43)));

		assertThat(01, log(is(1)));
		assertThat(010, log(is(8)));
		assertThat(020, log(is(16)));

		int _ = 1;
		assertThat(_, log(is(1)));

		String Double = "", String = "", Object = "", Arrays = "", Integer = "";
		assertThat(Double, log(is("")));
		assertThat(String, log(is("")));

	}
	
	void print(){
		
	}
}
