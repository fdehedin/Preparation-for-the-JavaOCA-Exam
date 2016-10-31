package ch.fdehedin.oca.DateAndTimes;

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

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PeriodTester {

	private static final Logger log = Logger.getLogger(PeriodTester.class.getSimpleName());

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	LocalDate now;
	LocalDate born;

	public PeriodTester(LocalDate born, LocalDate now) {
		this.born = born;
		this.now = now;
	}

	@Parameters
	public static Collection<Object[]> data() {
		LocalDate now = LocalDate.now();
		LocalDate born = LocalDate.of(1977, 6, 28);

		return Arrays.asList(new Object[][] { { born, now } });
	}

	@Test
	public void createPeriod() {
		Period period = Period.between(born, now);
		log.info(String.format("you lived %s years, %s months and %s days.", period.getYears(), period.getMonths(),
				period.getDays()));

		Period periodRemember = period;
		period.ofMonths(2);// no effect.. we eed to set a period object again..
							// again: immutable! like Strings..

		MatcherAssert.assertThat(period.getMonths(), Matchers.is(periodRemember.getMonths()));
		// period = Period.of(years, months, days)
		period = period.ofMonths(10);
		period = period.ofDays(2);

		MatcherAssert.assertThat(period.getMonths(), Matchers.is(0));
		log.info(String.format("months: %s, days: %s", period.getMonths(), period.getDays()));

		period = Period.ofMonths(10).ofWeeks(3);

		MatcherAssert.assertThat(period.getMonths(), Matchers.is(0));
		log.info(String.format("months: %s, days: %s", period.getMonths(), period.getDays()));

		// correct way, when creating a period of years,months and days!
		period = Period.of(3, 0, 1);

		LocalDate dateTime = this.born;
		dateTime = dateTime.plus(period);
		MatcherAssert.assertThat(dateTime.getMonth().getValue(), Matchers.is(6));
		MatcherAssert.assertThat(dateTime.getYear(), Matchers.is(1980));
		MatcherAssert.assertThat(dateTime.getDayOfMonth(), Matchers.is(29));

		// works..
		LocalDateTime dateTime2 = LocalDateTime.now();
		dateTime2 = dateTime2.plus(period);


		LocalDate dt = LocalDate.of(1977,  6,  28);
		//remember, we can't chain period.. so this will be only months...
		Period period1 = Period.ofDays(2).ofMonths(2);
		dt = dt.plus(period1);
		MatcherAssert.assertThat(dt.getDayOfMonth(), Matchers.is(28));
		MatcherAssert.assertThat(dt.getMonth().getValue(), Matchers.is(8));
		
		// doesn't work..
		LocalTime time = LocalTime.now();
		exception.expect(UnsupportedTemporalTypeException.class);
		time.plus(period);
		
	}

	@Test
	public void testformat() {
		String formatted = this.born.format(DateTimeFormatter.ISO_LOCAL_DATE);
		MatcherAssert.assertThat(formatted, Matchers.equalTo("1977-06-28"));

		// doesn't work!
		// formatted = this.born.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

		DateTimeFormatter formater = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		formatted = this.born.format(formater);
		MatcherAssert.assertThat(formatted, Matchers.equalTo("6/28/77"));

		formater = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		formatted = this.born.format(formater);
		MatcherAssert.assertThat(formatted, Matchers.equalTo("Jun 28, 1977"));

		formater = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		formatted = this.born.format(formater);
		MatcherAssert.assertThat(formatted, Matchers.equalTo("28.06.1977"));

		// times:
		LocalTime time = LocalTime.of(18, 00);
		formater = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		formatted = time.format(formater);
		MatcherAssert.assertThat(formatted, Matchers.equalTo("6:00 PM"));

		// Date and times:
		LocalDateTime datetime = LocalDateTime.of(this.born, time);
		formater = DateTimeFormatter.ofPattern("d.M.y h:ss");
		formatted = datetime.format(formater);
		MatcherAssert.assertThat(formatted, Matchers.equalTo("28.6.1977 6:00"));

		// cannot format time with a date pattern!
		formater = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		exception.expect(UnsupportedTemporalTypeException.class);
		formatted = time.format(formater);

	}

	@Test
	public void testParsing() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate dt = LocalDate.parse("28.06.1977", formatter);
		MatcherAssert.assertThat(dt.toString(), Matchers.equalTo("1977-06-28"));

		// can do also without datetime pattern
		dt = LocalDate.parse("1977-06-28");

		LocalTime time = LocalTime.parse("11:22");

		// doesn't work! Exception is thrown..
		// LocalDateTime dateTime = LocalDateTime.parse("1977-06-28");

		// this works:
		LocalDateTime dateTime = LocalDateTime.parse("1977-06-28T11:22");

	}

}
