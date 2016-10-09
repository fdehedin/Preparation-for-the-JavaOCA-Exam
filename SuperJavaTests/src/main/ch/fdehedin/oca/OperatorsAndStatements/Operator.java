package ch.fdehedin.oca.OperatorsAndStatements;

import java.util.logging.Logger;

/**
 * @author fdehedin
 *
 */
public class Operator {

	private static final Logger log = Logger.getLogger(Operator.class.getSimpleName());

	public static void main(String[] args) {
		new Operator().operate();
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

}
