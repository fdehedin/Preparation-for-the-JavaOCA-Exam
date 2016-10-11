package ch.fdehedin.oca.OperatorsAndStatements;

import java.util.logging.Logger;

import ch.fdehedin.oca.Util;

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

	public void compountOperate() {
		int x = 2, z = 3;
		x *= z; // same like x = x * z, but just more handy..

		log.info(String.format("x=%s", x));

		long n = 10;
		int y = 5;
		// y = y*n; does not compile (int cast missing).
		y *= n; // this works..

		log.info(String.format("y is first casted to long for the calculation, then back to: %s", Util.getType(y)));

		long o = 5;
		long s = (o = 7); // this also returns 7... so s is also 7;
		log.info(String.format("o is %s", o));
		log.info(String.format("s is %s", s));

	}

	public void logicalOperate() {
		boolean x = true;
		boolean z = false;

		// both have to be true
		log.info(String.format("x & z = %s", x & z));

		// one of both has to be true
		log.info(String.format("x | z = %s", x | z));

		// both have to be different
		log.info(String.format("x ^ z = %s", x ^ z));

	}
}
