package ch.fdehedin.oca.OperatorsAndStatements;

import java.util.logging.Logger;

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
				this.getType(x + y)));
	}

	/**
	 * Gets the type of a given object. Primitive types will be autoboxed..
	 * 
	 * @param o
	 * @return type name of the given object
	 */
	private String getType(Object o) {
		return o.getClass().getName();
	}

}
