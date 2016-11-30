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

	@Test
	public void convertArrayListToArrayToArrayList() {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("1");
		arrayList.add("2");
		Object[] array = arrayList.toArray();
		assertThat(array.length, is(2));

		// can't cast! this will throw exception
		// String[] arrayStr1 = (String[]) arrayList.toArray();
		// assertThat(arrayStr1.length, is(2));

		String[] arrayStr = arrayList.toArray(new String[0]);
		assertThat(arrayStr.length, is(2));

		String[] arrayStr2 = arrayList.toArray(new String[arrayList.size()]);
		assertThat(arrayStr2.length, is(2));

		List<String> lstNew = Arrays.asList(arrayStr2);
		assertThat(lstNew.size(), is(2));

		// now lets remove the 1 element of the original arrayList
		// remember: we cannot remove from lstNew..
		String s1 = arrayList.remove(0);
		assertThat(s1, equalTo("1"));
		assertThat(arrayList.size(), is(1));
 
		arrayList.add(0, "1");
		log.info(arrayList.toString());
		log.info(lstNew.toString());
		// AAAAND everything is same again!
		assertThat(arrayList.equals(lstNew), is(true));
		
		//remove by object returns boolean
		boolean b = arrayList.remove("1");
		assertThat(b, is(true));
		
		arrayList.add(0, "1");
		
		//remove by index returns removed object..
		String s = arrayList.remove(0);
		assertThat(s, equalTo("1"));
		//lets add it again
		arrayList.add(0, s);
		
		int i = arrayList.indexOf("1");
		assertThat(i, is(0));
		
	}

}
