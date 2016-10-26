package ch.fdehedin.oca.CoreJavaApis;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.hamcrest.Matcher;
import org.hamcrest.collection.IsArrayWithSize;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import ch.fdehedin.util.TestUtil;

/**
 * @author juiceterry
 *
 */
public class ArrayTester {

	private static final Logger log = Logger.getLogger(StringMethodTester.class.getSimpleName());

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void basicTests() {
		int[] numbers = new int[3]; // 3 elements
		assertThat(numbers[2], is(0));

		int[] numbers2 = { 23, 55, 87 };
		assertThat(numbers2.length, is(3));

		exception.expect(IndexOutOfBoundsException.class);
		assertThat(numbers[3], is(0)); // 0, 1, 2 = 3 elements...
	}

	@Test
	public void arrayInstantiator() {
		// all of those work even when there is space between brackets and type
		// definition..
		int[] arr1;
		int arr3[];

		int[] arr4, arr5; // 2 arrays of int..
		int arr6[], arr7; // 1 int array and 1 normal int..

		String[] bugs = { "cricket", "beetle", "ladybug" };
		String alias[] = bugs;

		assertThat(bugs == alias, is(true)); // 0, 1, 2 = 3 elements...

		assertThat(bugs.equals(alias), is(true)); // 0, 1, 2 = 3 elements...

		log.info(Arrays.toString(alias)); // pretty pring

		String birds[] = new String[6];
		assertThat(birds.length, is(6)); // 6, even though 6x null..

	}

	@Test
	public void testArrayExceptions() {
		int[] numbers = new int[10];

		exception.expect(ArrayIndexOutOfBoundsException.class);
		for (int i = 0; i <= numbers.length; i++)
			numbers[i] = i;

		exception.expect(ArrayIndexOutOfBoundsException.class);
		numbers[10] = 5; // throws exception.. 9 is the upper most bound!

		exception.expect(ArrayIndexOutOfBoundsException.class);
		numbers[numbers.length] = 5; // throws exception.. 9 is the upper most
										// bound!
	}

	@Test
	public void testSorting() {
		Integer numbers[] = { 3, 2, 1 };

		Arrays.sort(numbers);

		List<Integer> lst = Arrays.asList(numbers);
		assertThat(lst, TestUtil.isInAscendingOrdering());

	}

	@Test
	public void testSearching() {
		int numbers[] = { 3, 2, 1, 5, 8, 9 };
		Arrays.sort(numbers);

		int result;
 
		result = Arrays.binarySearch(numbers, 2);
		assertThat(result, is(1));

		result = Arrays.binarySearch(numbers, 4);
		assertThat(result, is(-4));// 1, 2, 3, 44444, 5 = -4 --> like before pos
									// 5!!

	}

	@Test
	public void testVarArgs() {

		this.testVarArgsSingle("super", "bla", "super", "test");
		this.testVarArgsSingle("Nur 1 param...");

	}

	private void testVarArgsSingle(String... args) {
		assertThat(args, arrayWithSize(isOneOf(1, 4)));
	}

}
