package ch.fdehedin.oca.CoreJavaApis;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
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
		ArrayList<String> list5 = new ArrayList<>();

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

		// remember:
		// remove(int) returns the object after removal
		// remove(Object) returns true after removal

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
}
