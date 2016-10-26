package ch.fdehedin.oca.OperatorsAndStatements;

import org.junit.Test;
import static ch.fdehedin.util.HamcrestLoggerMatcher.log;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class TernaryOperator {

	@Test
	public void checkWithoutTernary() {
		int y = 10;
		int x;
		if (y > 5) {
			x = 2 * y;
		} else {
			x = 3 * y;
		}
		assertThat(x, log(is(20)));
	}

	@Test
	public void checkWithTernary() {
		int y = 10;
		int x = (y > 5) ? (2 * y) : (3 * y);
		assertThat(x, log(is(20)));
	}

	@Test
	public void checkWithTernaryDifferentType() {
		int y = 10;
		String animal = "" + ((y < 20) ? 9 : "cat");

		assertThat(animal, log(equalTo("9")));
	}

}
