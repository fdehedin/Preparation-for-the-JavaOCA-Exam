package ch.fdehedin.oca.OperatorsAndStatements;

import java.util.logging.Logger;

import ch.fdehedin.oca.Util;

/**
 * @author fdehedin
 *
 */
public class NumericPromoter {

	private static final Logger log = Logger.getLogger(NumericPromoter.class.getName());

	public static void main(String[] args) {
		new NumericPromoter().promote();
	}

	/**
	 * 
	 */
	public void promote() {

		short x = 1;
		short y = 222;

		log.info(String.format("adding a int and a long will result in the larger type of the two: %s, type: %s", x + y,
				Util.getType(x + y)));
	}



}
