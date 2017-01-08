package ch.fdehedin.oca.ClassDesign;

import java.util.logging.Logger;

public class MixedParent {

	private static final Logger LOGGER = Logger.getLogger(MixedParent.class.getName());

	// if static, this will always return false
	// for instances (without static)if we ovveride in the child class, it will
	// return the childs methods result..
	public static boolean isGoodPractice() {
		return false;
	}

	public void initParent() {
		LOGGER.info(MixedChild.class.getSimpleName() + " inits.. it's good practice?->" + isGoodPractice());
	}
}
