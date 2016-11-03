package ch.fdehedin.oca.DesigningMethods.inland;

import ch.fdehedin.oca.DesigningMethods.shore.Bird;

public class BirdWatcherFromFar {

	public void watch() {
		Bird bird = new Bird();
		// bird.floatInWater();// doesn't work, because we're NOT in the same
		// Package!
	}
}