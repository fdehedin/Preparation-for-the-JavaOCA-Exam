package ch.fdehedin.oca.DesigningMethods.shore;

import java.util.logging.Logger;

import ch.fdehedin.oca.DateAndTimes.PeriodTester;
import ch.fdehedin.oca.DesigningMethods.MethodTests;

public class BirdWatcher {

	public void watch() {
		Bird bird = new Bird();
		bird.floatInWater();// works, because we're in the same Package!
	}
}