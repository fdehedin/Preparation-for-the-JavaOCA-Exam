package ch.fdehedin.oca.Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
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
public class UnEvenNumbersTester {
	private static final Logger log = Logger.getLogger(UnEvenNumbersTester.class.getSimpleName());

	@Test
	public void testMath() {

		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		this.printNumber(numbers, a -> a % 2 > 0);

		// This doesn't work, because the lstnumbers has an Array as data
		// backend!!! it will throw unsupportedOperationException..
		// List<Integer> lstNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		// lstNumbers.removeIf(a -> a > 3);

		// correct:
		List<Integer> lstNumbers = new ArrayList<>();
		for (int i : numbers)
			lstNumbers.add(i);

		lstNumbers.removeIf(a -> a % 2 == 0);
		log.info("uneven numbers: " + lstNumbers);
	}

	private void printNumber(int[] numbers, Predicate<Integer> predicator) {
		for (int n : numbers) {
			if (predicator.test(n)) {
				log.info("uneven number: " + n);
			}
		}

	}
}
