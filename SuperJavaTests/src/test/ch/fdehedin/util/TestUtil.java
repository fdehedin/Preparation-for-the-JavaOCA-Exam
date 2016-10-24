package ch.fdehedin.util;

import java.util.List;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class TestUtil {

	public static Matcher<? super List<Integer>> isInAscendingOrdering() {
		return new TypeSafeMatcher<List<Integer>>() {
			@Override
			public void describeTo(Description description) {
				description.appendText("describe the error has you like more");
			}

			@Override
			protected boolean matchesSafely(List<Integer> item) {
				for (int i = 0; i < item.size() - 1; i++) {
					if (item.get(i + 1) <= item.get(i))
						return false;
				}
				return true;
			}
		};
	}

}
