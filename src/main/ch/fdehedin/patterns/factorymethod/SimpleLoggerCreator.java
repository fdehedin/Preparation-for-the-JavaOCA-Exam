package ch.fdehedin.patterns.factorymethod;

public class SimpleLoggerCreator extends AbstractLoggerCreator {

	@Override
	public Logger createLogger() {
		Logger logger = new SimpleLogger();
		return logger;
	}
}