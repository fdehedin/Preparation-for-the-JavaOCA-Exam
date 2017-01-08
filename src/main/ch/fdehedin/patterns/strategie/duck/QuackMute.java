package ch.fdehedin.patterns.strategie.duck;

import java.util.logging.Logger;

public class QuackMute implements QuackBehaviour {

	private static final Logger LOGGER = Logger.getLogger(QuackMute.class.getSimpleName());

	@Override
	public void quack() {
		LOGGER.info("<<silence>>....");
	}

}
