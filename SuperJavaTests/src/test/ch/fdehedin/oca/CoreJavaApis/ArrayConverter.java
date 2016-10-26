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

public class ArrayConverter {
	private static final Logger log = Logger.getLogger(WrapperAndAutoboxer.class.getSimpleName());

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void turnArrayListIntoArray() {
		List<String> list = new ArrayList<>();
		list.add("test");
		list.add("blabla");

		Object[] objectArray = list.toArray();
		assertThat(objectArray, IsArrayWithSize.arrayWithSize(2));

		assertThat(objectArray, is(array(equalTo("test"), equalTo("blabla"))));

		String[] objectArray2 = list.toArray(new String[0]); // giving the
																// initial size
																// of the array
		assertThat(objectArray, IsArrayWithSize.arrayWithSize(2));

		list.add("TESslkdjflasjfdö");
		list.add("TESslkdjflasjfdö");
		list.add("TESslkdjflasjfdö");
		assertThat(list, hasSize(5));
		// that won't change the size of the array!
		assertThat(objectArray, IsArrayWithSize.arrayWithSize(2));
	}

	@Test
	public void turnArrayIntoArrayList() {
		String[] array = { "batman", "robin", "developer" };
		List<String> list = Arrays.asList(array);
		list.set(2, "TESTER");

		assertThat(list, hasSize(3));
		assertThat(list, contains("batman", "robin", "TESTER"));

		// change in array changes also the list, since it is the same
		// datastore!
		array[0] = "new superhero";
		assertThat(list, contains("new superhero", "robin", "TESTER"));

		// i can't change the size of the list!
		exception.expect(UnsupportedOperationException.class);
		list.add("test");
	}

}
