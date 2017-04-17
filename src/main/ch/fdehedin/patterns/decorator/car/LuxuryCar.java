package ch.fdehedin.patterns.decorator.car;

import java.util.logging.Logger;

public class LuxuryCar extends CarDecorator {

	private static final Logger LOGGER = Logger.getLogger(LuxuryCar.class.getSimpleName());

	public LuxuryCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		LOGGER.info(" Adding features of Luxury Car: alcantara interieur, media kit, etc.");
	}
}