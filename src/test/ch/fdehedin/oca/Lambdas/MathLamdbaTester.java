package ch.fdehedin.oca.Lambdas;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.logging.Logger;

import org.junit.Test;

/**
 * @author FDN
 *
 */
/**
 * @author FDN
 *
 */
public class MathLamdbaTester {
	private static final Logger log = Logger.getLogger(MathLamdbaTester.class.getSimpleName());

	@Test
	public void testMath() {

		// we setup the functions..
		MathOperation plus = (a, b) -> a + b;
		MathOperation minus = (a, b) -> a - b;
		MathOperation minus2 = (a, b) -> a - b;

		MathOperation minusFALSE = (a, b) -> {
			int i = 0;
			// int a = 0; can't, because it is a duplicate..
			return i;
		};

		MathOperation multiple = (a, b) -> {
			return (a * b);
		};
		MathOperation divide = (a, b) -> {
			return (a / b);
		};

		int result;
		result = plus.operation(10, 20);
		assertThat(result, is(30));

		result = minus.operation(10, 20);
		assertThat(result, is(-10));

		result = multiple.operation(10, 20);
		assertThat(result, is(200));

		result = divide.operation(20, 10);
		assertThat(result, is(2));

		log.info("plus: " + plus.operation(10, 20));
		log.info("minus: " + minus.operation(10, 20));

	}

	/**
	 * interface for the lamdba function
	 *
	 */
	private interface MathOperation {
		int operation(int a, int b);
	}
}
