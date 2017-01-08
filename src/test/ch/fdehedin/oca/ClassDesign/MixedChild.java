package ch.fdehedin.oca.ClassDesign;

import java.util.logging.Logger;

public class MixedChild extends MixedParent {

	private static final Logger LOGGER = Logger.getLogger(MixedChild.class.getName());

	// if static, this will always return true
	public static boolean isGoodPractice() {
		return true;
	}


	public void initChild() {
		LOGGER.info(MixedChild.class.getSimpleName() + " inits.. it's good practice?->" + isGoodPractice());
	}

	public static void main(String[] args) {
		MixedChild child = new MixedChild();
		child.initParent();
		child.initChild();
	}

}
