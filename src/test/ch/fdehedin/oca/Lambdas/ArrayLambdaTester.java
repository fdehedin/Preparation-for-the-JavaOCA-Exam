package ch.fdehedin.oca.Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;

public class ArrayLambdaTester {
	private static final Logger log = Logger.getLogger(ArrayLambdaTester.class.getSimpleName());

	@Test
	public void testArray() {

		String[] arr = new String[] { "test", "test2" };

		List<String> arrList = Arrays.asList(arr);

		// removing "Test"!
		// WILL THROW UNSUPPORTED OPERATION EXCEPTION
		// arrList.removeIf(a -> a.equals("test"));

		//this works, since it is a new ArrayList!!! and not backed 
		List<String> list = new ArrayList<>(arrList);
		list.removeIf(a -> a.equals("test"));

	}

}
