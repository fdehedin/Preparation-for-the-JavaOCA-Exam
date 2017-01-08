package ch.fdehedin.oca.Lambdas;

import java.util.function.Predicate;
import java.util.logging.Logger;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import ch.fdehedin.oca.primitives.PrimitiveTester;

public class MathOperationTester {

	private static final Logger log = Logger.getLogger(MathOperationTester.class.getSimpleName());

	@Test
	public void testMath() {

		MathOperation plus = (a, b) -> a + b;
		MathOperation minus = (a, b) -> a - b;

		assertThat(plus.operation(1, 2), is(3));
		assertThat(minus.operation(2, 1), is(1));

	}

	@Test
	public void testCheck() {

		int[] i = new int[10];
		log.info("arr pos 5: "+i[5]);
		
		
		MathOperationBool uneven = (a) -> a % 2 != 0;

		assertThat(uneven.check(3), is(true));
		assertThat(uneven.check(54), is(false));

		// same can be done with predicate!
		Predicate<Integer> unevenPredicate = (a) -> a % 2 != 0;
		assertThat(unevenPredicate.test(3), is(true));
		assertThat(unevenPredicate.test(54), is(false));
	}

}
