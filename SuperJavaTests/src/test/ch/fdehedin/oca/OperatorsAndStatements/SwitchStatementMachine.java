package ch.fdehedin.oca.OperatorsAndStatements;

import org.junit.Test;
import static ch.fdehedin.util.HamcrestLoggerMatcher.log;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.logging.Logger;

public class SwitchStatementMachine {

	private static final Logger log = Logger.getLogger(SwitchStatementMachine.class.getSimpleName());

	@Test
	public void checkSwichStatement() {
		byte b = 2;
		final byte b2 = 2;
		final byte b1 = 1;
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

}
