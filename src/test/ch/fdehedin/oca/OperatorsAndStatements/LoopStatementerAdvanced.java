package ch.fdehedin.oca.OperatorsAndStatements;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import static ch.fdehedin.util.HamcrestLoggerMatcher.log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;

public class LoopStatementerAdvanced {

	private static final Logger log = Logger.getLogger(LoopStatementerAdvanced.class.getSimpleName());

	// works:
	long a = 12321321300L;

	// the following doesn't work, since the literal is actually an "int" and is
	// converted to
	// long.. and the literal is too big for int.. put an L at the end of the
	// literal to tell java that this is explizitly a long primitive type
	// long b = 12321321300;

	@Test
	public void testBreak() {
		outer: for (long i = 1; i < 5; i++) {
			switch ((int) i) {
			case 1:
				log.info("1");
				break;
			default:
				log.info("Standard");
			case 2:
				log.info("2");
				// break outer;
			}
		}
	}

	@Test
	public void nestedLoop() {

		// weird, but works..
		int n = 9;
		while (n++ < 10) {
		}

		int x = 20;
		String result = "";
		while (x > 0) {
			do {
				x -= 2;
			} while (x > 5);
			x--;
			result += x + "";
		}

		assertThat(result, log(equalTo("30")));
	}

	@Test
	public void labelerBreaker() {

		int x = 10;
		String result = "";
		OUTER_LOOP: while (x > 0) {
			do {
				x--;
				result += x + "";
				if (x == 5) {
					break OUTER_LOOP;
				}
			} while (true);// danger!!

		}

		assertThat(result, log(equalTo("98765")));
	}

	@Test
	public void labelerContinuer() {

		int x = 10;
		String result = "";
		OUTER_LOOP: while (x > 0) {
			do {
				x--;
				if (x == 5) {
					// we do not like 5, so we exit this inner loop and continue
					// to the outer loop!
					continue OUTER_LOOP;
				}
				result += x + "";
			} while (x > 0);

		}

		assertThat(result, log(equalTo("987643210")));
	}

}
