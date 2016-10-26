package ch.fdehedin.oca.OperatorsAndStatements;

import org.junit.Test;
import static ch.fdehedin.util.HamcrestLoggerMatcher.log;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.logging.Logger;

/**
 * @author juiceterry The following Data types can be "switched": byte and Byte,
 *         short and Short, char and Character, int and Integer, String, enum
 *         values
 *
 */
public class SwitchStatementMachine {

	private static final Logger log = Logger.getLogger(SwitchStatementMachine.class.getSimpleName());

	@Test
	public void checkSwichStatementWithBytePrimitive() {
		byte b = 2;
		final byte b2 = 2; // variables must be final (compile time constant
							// variables)
		final byte b1 = 1; // same here..
		byte result = 0;
		switch (b) {
		case (b1):
			log.info("b is 1");
			result = b1;
			break;
		case (b2):
			log.info("b is 2");
			result = b2;
			break;
		default:
			log.info("b is default");
		}
		assertThat(Byte.toString(result), log(equalTo("2")));
	}

	@Test
	public void checkSwichStatementWithBreaks() {

		int dayOfWeek = 0;

		switch (dayOfWeek) {
		case 0: 
			// if dayOyWeek is 0, then the code jumps into this case, and
			// because there's no break, continues to all the other cases....
			log.info("Sonntag");
		default:
			log.info("Wochentag");
		case 6:
			log.info("Samstag");
		}
	}

}
