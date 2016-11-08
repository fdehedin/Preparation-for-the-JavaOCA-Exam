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
public class PassByValueTester {

	private static final Logger LOGGER = Logger.getLogger(PassByValueTester.class.getName());

	@Test
	public void testMethod() {
		Integer i = new Integer(10);
		this.testPassByParam(i);
		assertThat(i, is(10));
	}

	private void testPassByParam(Integer param) {
		param++;
	}

}