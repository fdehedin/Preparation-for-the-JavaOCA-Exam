package ch.fdehedin.patterns.decorator.car;

import java.util.logging.Logger;

public class SuvCar extends CarDecorator {

	private static final Logger LOGGER = Logger.getLogger(SuvCar.class.getSimpleName());

	
	public SuvCar(Car c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		LOGGER.info(" Adding features of SUV Car: high dampers, biiig wheels");
	}
}