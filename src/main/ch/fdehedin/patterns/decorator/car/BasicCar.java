package ch.fdehedin.patterns.decorator.car;

import java.util.logging.Logger;

import ch.fdehedin.patterns.factory.pizza.CheesePizza;

public class BasicCar implements Car {

	private static final Logger LOGGER = Logger.getLogger(BasicCar.class.getSimpleName());

	@Override
	public void assemble() {
		LOGGER.info("assemble basic car.");

	}

}
