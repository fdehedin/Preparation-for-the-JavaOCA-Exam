package ch.fdehedin.patterns.decorator.car;

import java.util.logging.Logger;

public class FourWheelDriveCar extends CarDecorator {

	private static final Logger LOGGER = Logger.getLogger(FourWheelDriveCar.class.getSimpleName());

	public FourWheelDriveCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		LOGGER.info(" Adding features of 4WD Car: gear box, etc.");
	}
}