package ch.fdehedin.oca.DesigningMethods.goose;

import ch.fdehedin.oca.DesigningMethods.shore.Bird;

public class Gosling extends Bird {

	public void swim() {
		floatInWater(); // works, calling a protected method of superclass..
	}

}