package ch.fdehedin.patterns.strategie.duck;

import java.util.logging.Logger;

public class DuckMallard extends Duck {

	private static final Logger LOGGER = Logger.getLogger(DuckMallard.class.getSimpleName());

	public DuckMallard() {
		this.flyBehaviour = new FlyWithWings();
		this.quackBehaviour = new Quack();
	}

	@Override
	public void display() {
		LOGGER.info("i am a Mallard Duck!");
	}

}
