package ch.fdehedin.patterns.decorator.car;

import java.util.logging.Logger;

import org.junit.Test;

public class CarDecoratorTest {

	private static final Logger LOGGER = Logger.getLogger(CarDecoratorTest.class.getSimpleName());

	@Test
	public void assemble() {
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar = new FourWheelDriveCar(sportsLuxuryCar);
		Car suvSuperCar = new SuvCar(sportsLuxuryCar);
		suvSuperCar.assemble();
	}
}