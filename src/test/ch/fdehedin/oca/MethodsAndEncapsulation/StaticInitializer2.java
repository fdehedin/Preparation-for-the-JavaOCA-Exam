package ch.fdehedin.oca.MethodsAndEncapsulation;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.logging.Logger;

public class StaticInitializer2 {

	private static final Logger log = Logger.getLogger(StaticInitializer2.class.getSimpleName());

	// SECOND
	public static final LocalDateTime DATE_NOW;
	public static final LocalDateTime DATE_NOW2 = LocalDateTime.now();

	// doesn't compile, since it is never initialihed...final class variables
	// have to be initalized!
	// public static final LocalDateTime DATE_NOW3;

	// FIRST
	static {
		DATE_NOW = LocalDateTime.now();
		// cannot init a final variable twice
		// DATE_NOW = LocalDateTime.now();

		// this static final is already once initalized... so we cannot init
		// them here..
		// DATE_NOW = LocalDateTime.now();
	}

	@Test
	public void testDateNow() {
		// datetime of initialisation
		log.info("static:" + DATE_NOW);
		// datetime of calling this method (little bit behind)
		log.info("test:" + LocalDateTime.now());

		// still the same..
		log.info("instance:" + new StaticInitializer2().DATE_NOW);

		// DATE_NOW is liiitle bit before...
		assertThat(DATE_NOW.isBefore(LocalDateTime.now()), is(true));

	}

}
