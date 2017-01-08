package ch.fdehedin.patterns.strategie.duck;

import java.util.logging.Logger;

public class QuackSqueak implements QuackBehaviour {

	private static final Logger LOGGER = Logger.getLogger(QuackSqueak.class.getSimpleName());

	@Override
	public void quack() {
		LOGGER.info("Squeak!");
	}

}
