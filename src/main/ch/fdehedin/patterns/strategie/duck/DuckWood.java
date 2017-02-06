package ch.fdehedin.patterns.strategie.duck;

import java.util.logging.Logger;

public class DuckWood extends Duck {

	private static final Logger LOGGER = Logger.getLogger(DuckWood.class.getSimpleName());

	public DuckWood() {
		this.flyBehaviour = new FlyNoWay();
		this.quackBehaviour = new QuackMute();
	}

	@Override
	public void display() {
		LOGGER.info("i am a Wooden Duck!");
	}

}
