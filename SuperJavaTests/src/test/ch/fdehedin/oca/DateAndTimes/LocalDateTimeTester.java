package ch.fdehedin.oca.DateAndTimes;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.hamcrest.Matcher;
import org.hamcrest.collection.IsArrayWithSize;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import ch.fdehedin.oca.CoreJavaApis.WrapperAndAutoboxer;
import ch.fdehedin.util.TestUtil;

public class LocalDateTimeTester {

	private static final Logger log = Logger.getLogger(LocalDateTimeTester.class.getSimpleName());

	@Test
	public void testTypes() {
		log.info(String.format("LocalDate: %s", LocalDate.now()));
		log.info(String.format("LocalTime: %s", LocalTime.now()));
		log.info(String.format("LocalDateTime: %s", LocalDateTime.now()));

		LocalDate date1 = LocalDate.of(1977, Month.JUNE, 28); // Month constant
		LocalDate date2 = LocalDate.of(1977, 6, 28);// month int

		assertThat(date1, is(date2));
	}

}
