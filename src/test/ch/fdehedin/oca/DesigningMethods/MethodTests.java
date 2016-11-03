package ch.fdehedin.oca.DesigningMethods;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Logger;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//@RunWith(Parameterized.class)
public class MethodTests {

	private static final Logger LOGGER = Logger.getLogger(MethodTests.class.getName());

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	/*
	 * @Parameters public static Collection<Object[]> data() { LocalDate now =
	 * LocalDate.now(); LocalDate born = LocalDate.of(1977, 6, 28);
	 * 
	 * return Arrays.asList(new Object[][] { { born, now } }); }
	 */

	public MethodTests() {

	}

	private void privateMethodOnlyVisibleInThisClass() {

	}

	public void publicMethodVisibleFromOutside() {

	}

	protected void protectedMethodVisibleFromSamePackageAndChildrenClasses() {

	}

	/**
	 * Do not place the 'default' keyword in front, it won't compile!
	 */
	void defaultMethodVisibleFromSamePackage() {

	}

	/**
	 * This method can't be overriden by child classes..
	 */
	public final void test1() {

	}

	// only in abstract class..
	// public abstract void test2();

	// does compile! but only if the class is abstract..
	// abstract public void test3();

	/**
	 * Does compile, optional specifiers can appear before the access modifier!
	 */
	final public void test4() {

	}

	/**
	 * Method names can contain alphas, numbers, $ and _, but cannot start with
	 * number!
	 * 
	 * @return always null
	 */
	Integer $_return_$trangeMeth0dNam3() {
		return null;
	}

	/**
	 * Separate multiple possible Exceptions with comma.."throws" can only be
	 * one..
	 * 
	 * @throws IllegalStateException
	 * @throws IllegalMonitorStateException
	 */
	void returnException() throws IllegalStateException, IllegalMonitorStateException {
	}

	public String varArgTestMethod(int start, int... end) {
		LOGGER.info("end:" + end);
		return String.format("start=%s / varargs=%s", start, Arrays.toString(end));

	}

	@Test
	public void varArgTestCaller() {
		String result = this.varArgTestMethod(1, 2, 3, 4);
		assertThat(result, equalTo("start=1 / varargs=[2, 3, 4]"));

		// returns empty array, but not NULL!!!
		result = this.varArgTestMethod(1);
		assertThat(result, equalTo("start=1 / varargs=[]"));

		result = this.varArgTestMethod(333, new int[] { 2, 3, 4 });
		assertThat(result, equalTo("start=333 / varargs=[2, 3, 4]"));

		result = this.varArgTestMethod(123, null);
		assertThat(result, equalTo("start=123 / varargs=null"));

		// doesn't compile!
		// result = this.varArgTestMethod(123, null, null);

	}

	protected void someMethod() {

	}

	protected static void someStaticMethod() {

	}

}