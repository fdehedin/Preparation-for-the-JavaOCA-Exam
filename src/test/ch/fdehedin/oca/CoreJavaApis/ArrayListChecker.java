package ch.fdehedin.oca.CoreJavaApis;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author juiceterry
 *
 */
public class ArrayListChecker {

	private static final Logger log = Logger.getLogger(ArrayListChecker.class.getSimpleName());

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void intialize() {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(3);
		ArrayList list3 = list2;

		assertThat(list3 == list2, is(true));

		// since java 7, both work:
		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<>();

	}

	@Test
	public void listComparer() {
		List<String> lst1 = new ArrayList<String>();
		List<String> lst2 = new ArrayList<>();

		lst1.add("abc");
		lst2.add("abc");

		// is FALSE! just remember.. not the same object..
		assertThat(lst1 == lst2, is(false));

		// every list item is compared..
		assertThat(lst1.equals(lst2), is(true));

		List<Integer> lst3 = new ArrayList<Integer>();
		List<Integer> lst4 = new ArrayList<>();
		lst3.add(1);
		lst4.add(1);

		// is FALSE! just remember.. not the same object..
		assertThat(lst3 == lst4, is(false));

		// every list item is compared..
		assertThat(lst3.equals(lst4), is(true));
	}

	@Test
	public void add() {

		ArrayList list1 = new ArrayList();

		// since java 7, both work:
		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<>();

		list1.add("test");
		list1.add(Boolean.TRUE);

		list5.add("Test");
		// list5.add(Boolean.TRUE);// can't..only string..

		// insert a new element at pos 1 (after 0)
		list1.add(1, 123);
		ArrayList lstCompare = new ArrayList();
		lstCompare.add("test");
		lstCompare.add(123);
		lstCompare.add(Boolean.TRUE);
		assertThat(list1, equalTo(lstCompare));
	}

	@Test
	public void remove() {
		List<String> list5 = new ArrayList<>();

		list5.add("Test");
		list5.add("Test");
		list5.add("Test3");
		assertThat(list5.size(), is(3));

		String test = "Test";

		list5.remove(test);
		assertThat(list5.size(), is(2));
		list5.remove(test);
		assertThat(list5.size(), is(1));

		// a remove of a non existing element just returns false;
		assertThat(list5.remove("THISANDTHAT"), is(false));

		// removing element 0, which is "Test3" by now..java is returnng it
		// after removning..
		assertThat(list5.remove(0), equalTo("Test3"));

		list5.add("Test");
		assertThat(list5.remove("Test"), equalTo(true));

		list5.add("Test");
		assertThat(list5.remove("abc"), equalTo(false));
		// remember:
		// remove(int) returns the object after removal
		// remove(Object) returns true after removal

		List<Integer> listInts = new ArrayList<Integer>();
		listInts.add(1);
		listInts.add(2);
		listInts.add(3);

		// this will return the object!
		assertThat(listInts.remove(1), equalTo(2));

	}

	@Test
	public void autoboxerAdd(){
		ArrayList<Double> lst = new ArrayList();
		lst.add((double) 123);
		lst.indexOf("Stest");
	}
	
	@Test
	public void set() {
		ArrayList<String> lst = new ArrayList<>();

		lst.add("Test1");
		lst.add("Test2");
		assertThat(lst.size(), is(2));

		// a set method sets the new string, and returns the old value!
		assertThat(lst.set(1, "TEST NEW"), equalTo("Test2"));

		// size is still the same
		assertThat(lst.size(), is(2));

		exception.expect(IndexOutOfBoundsException.class);
		lst.set(100, "test, that will throw!");
	}

	@Test
	public void emptyAndSize() {
		ArrayList<String> lst = new ArrayList<>();
		assertThat(lst.isEmpty(), is(true));
		assertThat(lst.size(), is(0));

		lst.add("something");
		assertThat(lst.isEmpty(), is(false));
		assertThat(lst.size(), is(1));

		String something = new String("something");

		lst.add(something);
		lst.add(something);
		lst.add(something);

		// ArrayList can contain more than 1 times the same object..
		assertThat(lst.size(), is(4));

	}

	@Test
	public void contains() {
		ArrayList<String> lst = new ArrayList<>();

		lst.add("something1");

		String something = new String("something");
		lst.add(something);

		// same object
		assertThat(lst.contains(something), is(true));

		// same object, same literal
		assertThat(lst.contains("something"), is(true));

		// same object, same literal
		assertThat(lst.contains("some" + "thing"), is(true));

	}

	@Test
	public void equals() {
		ArrayList<String> lst = new ArrayList<>();
		lst.add("something" + 1);

		ArrayList<String> lst2 = new ArrayList<>();
		lst2.add("something1");

		// will return true, altough the first lst is not the same literal..
		// anyway, array is checking with "equals"
		assertThat(lst.equals(lst2), is(true));

		lst2.set(0, "new");
		// of course, this will result false..
		assertThat(lst.equals(lst2), is(false));

	}

	@Test
	public void convertArrayToListToArray() {
		int[] arr1 = { 1, 2, 3 };
		// this won't compile, since Array.asList doesn't deal with autoboxing..
		// List<Integer> lst1 = Arrays.asList(arr1);

		Integer[] arr2 = { 1, 2, 3 };
		List<Integer> lst1 = Arrays.asList(arr2);
		// this will throw an exception, since we have an array as "datastore"
		// lst1.remove(0);

		List<Integer> lst2 = new ArrayList<>(Arrays.asList(arr2));
		System.out.println(lst2.remove(3)); // true;

	}

	@Test
	public void testSublist() {
		Integer[] arr2 = { 1, 2, 3 };
		List<Integer> lst2 = new ArrayList<>(Arrays.asList(arr2));
		log.info("lst2:" + lst2);
		List<Integer> lst3 = lst2.subList(1, 2);
		log.info("lst2 after sublist (it will be 1,2,3):" + lst2);
		log.info("lst3: will be [2]:" + lst3);
	}
}
