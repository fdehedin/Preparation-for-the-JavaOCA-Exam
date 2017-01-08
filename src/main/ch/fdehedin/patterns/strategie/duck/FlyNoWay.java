package ch.fdehedin.patterns.strategie.duck;

import java.util.logging.Logger;

public class FlyNoWay implements FlyBehaviour {

	private static final Logger LOGGER = Logger.getLogger(FlyNoWay.class.getSimpleName());

	@Override
	public void fly() {
		LOGGER.info("Nope, i can't fly..");
	}

}
