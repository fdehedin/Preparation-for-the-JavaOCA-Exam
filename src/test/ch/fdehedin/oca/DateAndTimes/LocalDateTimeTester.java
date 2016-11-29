package ch.fdehedin.oca.DateAndTimes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LocalDateTimeTester {

	private static final Logger log = Logger.getLogger(LocalDateTimeTester.class.getSimpleName());

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void testParsing() {
		LocalDate date = LocalDate.parse("1977-06-28");
		log.info("date: " + date);

		// DateTimeParseExceptoin
		// LocalDate date2 = LocalDate.parse("1977-6-28");
		// log.info("date2: " + date2);

		// DateTimeParseExceptoin
		// LocalDateTime dateTime = LocalDateTime.parse("1977-06-28");
		// log.info("date: " + dateTime);

		LocalDateTime dateTime = LocalDateTime.parse("2016-11-29T09:03:34");
		log.info("dateTime: " + dateTime);

		LocalTime time = LocalTime.parse("09:03:34");
		log.info("time: " + time);
		


	}

	@Test
	public void testISO() {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();

		// thwors temporal exception!!!!
		// String dateString = date.format(DateTimeFormatter.ISO_DATE_TIME);

		String dateString = date.format(DateTimeFormatter.ISO_DATE);
		log.info(dateString);

		String timeString = time.format(DateTimeFormatter.ISO_TIME);
		log.info(timeString);
	}

	@Test
	public void testTypes() {
		log.info(String.format("LocalDate: %s", LocalDate.now()));
		log.info(String.format("LocalTime: %s", LocalTime.now()));
		log.info(String.format("LocalDateTime: %s", LocalDateTime.now()));

		LocalDate date1 = LocalDate.of(1977, Month.JUNE, 28); // Month constant
		LocalDate date2 = LocalDate.of(1977, 6, 28);// month int

		assertThat(date1, is(date2));
	}

	@Test
	public void testCreation() {
		// year, month, day
		LocalDate date1 = LocalDate.of(2016, 10, 29);
		LocalDate date2 = LocalDate.of(1977, 6, 28);

		// hours,minutes,(seconds)
		LocalTime time1 = LocalTime.of(12, 51);
		LocalTime time2 = LocalTime.of(12, 51, 20);

		LocalDateTime dateTime1 = LocalDateTime.of(date2, time1);

		assertThat(dateTime1.getHour(), is(12));
		assertThat(dateTime1.getMinute(), is(51));
		assertThat(dateTime1.getSecond(), is(0));// default
		assertThat(dateTime1.getYear(), is(1977));
		assertThat(dateTime1.getMonth().getValue(), is(6)); // int value
		assertThat(dateTime1.getMonth(), is(Month.JUNE)); // enum month value

		// LocalDate dt = new LocalDate();// LocalDate functions are all static

		// chaining
		dateTime1 = dateTime1.plusHours(3).plusMonths(2);
		assertThat(dateTime1.getHour(), is(15));
		assertThat(dateTime1.getMonth(), is(Month.AUGUST));

		exception.expect(DateTimeException.class);
		LocalDate.of(2020, 20, 20);

		LocalDate dt = LocalDate.now();
		// dt.plusMinutes(1)//does not compile.. because its LocalDate, not
		// LocalTime nor LocalDateTime
	}

	@Test
	public void test3() {
		// international date format ISO.....
		LocalDateTime current = LocalDateTime.now();
		log.info("current date time: " + current);
		LocalDateTime tomorrow = current.plusDays(1);
		log.info("current date time after plus days: " + current);
		log.info("tomorrow date time: " + tomorrow);
		Period diffNowTomorrow = Period.between(tomorrow.toLocalDate(), current.toLocalDate());
		log.info("difference from today and tomorrow (period / days): " + diffNowTomorrow.getDays());

		LocalDate myBorn = LocalDate.of(1977, 6, 28);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.M.yyyy");

		String myBornFormatted = myBorn.format(df);
		log.info("myBornFormatted: " + myBornFormatted);
		assertThat(myBornFormatted, equalTo("28.6.1977"));

	}

	@Test
	public void manipulate() {
		LocalDateTime dateTime2 = LocalDateTime.of(1977, 6, 28, 12, 00);
		dateTime2.plusDays(1);
		// it is still 28, because dateTime is immutable, so we need to set the
		// object again! similar like String..
		assertThat(dateTime2.getDayOfMonth(), is(28));

		dateTime2 = dateTime2.plusDays(1);
		dateTime2 = dateTime2.plusHours(2);
		dateTime2 = dateTime2.plusSeconds(3);

		// day is now 29, hour is 14, seconds added new 3 secs..
		assertThat(dateTime2.toString(), equalTo("1977-06-29T14:00:03"));

		dateTime2 = dateTime2.minusHours(24);
		assertThat(dateTime2.toString(), equalTo("1977-06-28T14:00:03"));
	}

}
