package ch.fdehedin.patterns.strategie.duck;

import java.util.logging.Logger;

public class DuckRubber extends Duck {

	private static final Logger LOGGER = Logger.getLogger(DuckRubber.class.getSimpleName());

	public DuckRubber() {
		this.flyBehaviour = new FlyNoWay();
		this.quackBehaviour = new QuackSqueak();
	}

	@Override
	public void display() {
		LOGGER.info("i am a Rubber Duck!");
	}

}
