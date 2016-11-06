package ch.fdehedin.oca.MethodsAndEncapsulation;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.logging.Logger;

public class Autoboxer {

	private static final Logger log = Logger.getLogger(Autoboxer.class.getSimpleName());

	@Test
	public void testAutoboxing() {
		log.info(String.format("jumping with class type:%s", this.jump(2)));
		log.info(String.format("jumping with class type:%s", this.jump(2, 1)));
		log.info(String.format("jumping with class type:%s", this.jump(3, 2, 1)));
	}

	private String jump(Integer meters) {
		log.info("jumping: " + meters);
		return meters.getClass().getSimpleName();
	}

	// it is not being called.. the upper Method is closer matching the args..
	private String jump(Integer... meters) {
		log.info("jumping varargs: " + meters);
		return meters.getClass().getSimpleName();
	}

	private String jump(Integer meters, int meter2) {
		log.info("jumping 2 meters: " + meters + " , " + meter2);
		return "2 params";
	}

	// public String jump(int meters) {
	// log.info("jumping: " + meters);
	// return meters.getClass().getSimpleName(); DOES NOT COMPILE, we cannot
	// call methods on a primitive--
	// but actually, this methods would have been called when we call jump(123)
	// }

	@Test
	public void testReferenceTypes() {
		printType("test");
		printType((int) 123);// automatically stuffs the int into a long..
		printType(123L);
		printType(new Long(123L));
		printType(2.0);// works only because we have an Object method
						// signature..otherwise it wouldn't compile..
	}

	private void printType(Long l) {
		log.info("Long call with " + l.getClass().getSimpleName() + ": " + l);
	}

	private void printType(long l) {
		log.info("Long call with long primitive: " + l);
	}

	private void printType(Object o) {
		log.info("Object call with " + o.getClass().getSimpleName() + ": " + o);
	}
}
