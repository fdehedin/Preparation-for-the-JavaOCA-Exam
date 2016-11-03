package ch.fdehedin.oca.DesigningMethods.shore;

import java.util.logging.Logger;

import ch.fdehedin.oca.DateAndTimes.PeriodTester;
import ch.fdehedin.oca.DesigningMethods.MethodTests;

public class Bird {

	private static final Logger log = Logger.getLogger(Bird.class.getSimpleName());

	protected String text = "floating";

	protected void floatInWater() {
		log.info(text);
	}

}