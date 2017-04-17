package ch.fdehedin.patterns.decorator.car;

import java.util.logging.Logger;

public class SportsCar extends CarDecorator {

	private static final Logger LOGGER = Logger.getLogger(SportsCar.class.getSimpleName());

	
	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		LOGGER.info(" Adding features of Sports Car: 8V, 500hp");
	}
}