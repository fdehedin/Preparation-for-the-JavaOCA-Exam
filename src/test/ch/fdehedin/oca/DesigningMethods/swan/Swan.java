package ch.fdehedin.oca.DesigningMethods.swan;

import ch.fdehedin.oca.DesigningMethods.shore.Bird;

public class Swan extends Bird {

	public void watch() {
		Bird bird = new Bird();
		// bird.floatInWater();// works, because we're in the same Package AND
		// it is not a Swan!
		Swan swan = new Swan();
		swan.floatInWater(); // works, because we're in a Swan and calling a
								// swan method..thus we can access the super
								// class method..

		Bird birdSwan = new Swan();
		// birdSwan.floatInWater();// can't because it's a Bird reference..
	}
}