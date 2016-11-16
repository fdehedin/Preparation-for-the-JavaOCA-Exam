package ch.fdehedin.oca.CoreJavaApis;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.hamcrest.collection.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ArrayCopyTester {
	private static final Logger LOG = Logger.getLogger(ArrayCopyTester.class.getSimpleName());

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	public static void main(String[] args) throws Exception {
		System.out.println("TEST");
	}

	//public boolean checkIt(int k) {
	Object b = Boolean.parseBoolean("true");
	//}

	public void testCopy() {
		int[] arr1 = new int[] { 1, 2, 3 };
		int[] arr2 = new int[] { 4, 5, 6 };

		System.arraycopy(arr1, 0, arr2, 0, arr1.length);

		assertThat(arr1, equalTo(arr2));
		assertThat(arr1, equalTo(new int[] { 1, 2, 3 }));

		arr1 = new int[] { 1, 2, 3 };
		arr2 = new int[] { 4, 5, 6 };

		// now copy the source array FROM pos 1 (actually second pos)
		System.arraycopy(arr1, 1, arr2, 0, arr1.length - 1);

		// first array is still the same!
		assertThat(arr1, equalTo(new int[] { 1, 2, 3 }));

		// second array has changed..
		assertThat(arr2, equalTo(new int[] { 2, 3, 6 }));

		arr1 = new int[] { 1, 2, 3 };
		arr2 = new int[] { 4, 5, 6 };

		// now copy only 1 element
		System.arraycopy(arr1, 0, arr2, arr2.length - 1, 1);
		assertThat(arr2, equalTo(new int[] { 4, 5, 1 }));

	}
}
