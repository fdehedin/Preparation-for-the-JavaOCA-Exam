package ch.fdehedin.oca.OperatorsAndStatements;

import static ch.fdehedin.util.HamcrestLoggerMatcher.log;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.logging.Logger;

import org.junit.Test;

/**
 * @author fdehedin
 *
 */
public class StatementTester {

	private static final Logger log = Logger.getLogger(StatementTester.class.getSimpleName());

	@Test
	public void simpleStatementTest() {
		int hourOfDay = 8;
		int testHour = 11;
		boolean result = false;
		if (hourOfDay < testHour) {
			result = true;
		}
		assertThat("testing the boolean", result, log(is(true)));
		assertThat("checking the values again", Integer.valueOf(hourOfDay), log(lessThan(Integer.valueOf(10))));

		boolean b = false;
		boolean s = false;
		if (b = (s = true)) {
			log.info(String.format("now b should be true, because the expression returns true: %s", s));
			assertThat(b, log(is(true)));
		}

		int i = 1;
		if (true)
			i = 2;
		else
		i = 3;i=4;

		log.info(String.format("i is now: %s", i));
		
	}

}
