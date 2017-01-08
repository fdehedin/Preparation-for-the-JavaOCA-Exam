package ch.fdehedin.patterns.strategie.duck;

import java.util.logging.Logger;

public class Quack implements QuackBehaviour {

	private static final Logger LOGGER = Logger.getLogger(Quack.class.getSimpleName());

	@Override
	public void quack() {
		LOGGER.info("Quack");
	}

}
