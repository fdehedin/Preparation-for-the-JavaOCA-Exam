package ch.fdehedin.patterns.strategie.duck;

import java.util.logging.Logger;

public class FlyWithWings implements FlyBehaviour {

	private static final Logger LOGGER = Logger.getLogger(FlyWithWings.class.getSimpleName());

	@Override
	public void fly() {
		LOGGER.info("i am really flying");
	}

}
