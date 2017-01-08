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
public class MultiDimensionArrayTester {

	private static final Logger log = Logger.getLogger(MultiDimensionArrayTester.class.getSimpleName());

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void intialize() {
		int[][] vars1; // 2D Array
		int vars2[][];// 2D Array
		int[] vars3[];// 2D Array
		int[] vars4[], vars5[][];// 23 Array

		String[][] rectangle = new String[2][3];
		assertThat(rectangle.length, is(2));
		assertThat(rectangle[0].length, is(3));

		int[][] differentSizeArray = { { 1, 2, 3 }, { 1, 2 }, { 1 } };
		assertThat(differentSizeArray.length, is(3));
		assertThat(differentSizeArray[1].length, is(2));

	}

	@Test
	public void loopyLoop() {
		int[][] differentSizeArray = { { 1, 2, 3 }, { 1, 2 }, { 1 } };

		for (int i = 0; i < differentSizeArray.length; i++)
			for (int y = 0; y < differentSizeArray[i].length; y++)
				log.info(String.format("i = %s, y = %s", Arrays.toString(differentSizeArray[i]),
						differentSizeArray[i][y]));

		//more easy:
		for (int[] twoDimension : differentSizeArray)
			for (int d : twoDimension)
				log.info(String.format("SECOND: i = %s, y = %s", Arrays.toString(twoDimension), d));
	}
}
