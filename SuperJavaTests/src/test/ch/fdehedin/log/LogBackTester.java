package ch.fdehedin.log;

import org.junit.Test;
// see build.gradle for imports
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

public class LogBackTester {

	public static final Logger logger = LoggerFactory.getLogger("AnyUniqueStringHere");

	public static void printLoggerState() {
		// print internal state
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		StatusPrinter.print(lc);
	}

	@Test
	public void myTest() {
		printLoggerState(); // to console
		logger.info("Hello World");
	}

}