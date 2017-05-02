package ch.fdehedin.patterns.factorymethod;

import org.junit.Test;

public class LoggerTester {

	@Test
	public void logTest() {

		// for the purposes of this example, create an XMLLoggerCreator
		// directly, //but this would normally be passed to constructor for use.
		AbstractLoggerCreator creator = new SimpleLoggerCreator();
		Logger logger = creator.createLogger();
		logger.log("test message on simple logger");

		creator = new XMLLoggerCreator();
		logger = creator.createLogger();
		logger.log("another message in XML");

	}
}
