package ch.fdehedin.patterns.decorator.car;

import java.util.logging.Logger;

import ch.fdehedin.patterns.factory.pizza.CheesePizza;

public class CarDecorator implements Car {

	private static final Logger LOGGER = Logger.getLogger(CarDecorator.class.getSimpleName());

	protected Car car;

	public CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public void assemble() {
		this.car.assemble();
	}

}
