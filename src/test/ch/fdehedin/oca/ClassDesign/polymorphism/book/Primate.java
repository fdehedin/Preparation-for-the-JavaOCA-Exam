package ch.fdehedin.oca.ClassDesign.polymorphism.book;

import java.util.logging.Logger;

import ch.fdehedin.oca.MethodsAndEncapsulation.MethodParamTester;

public class Primate {

	private static final Logger LOG = Logger.getLogger(Primate.class.getSimpleName());
	protected boolean hasHair = true;

	public boolean hasHair() {
		return this.hasHair;
	}
}
