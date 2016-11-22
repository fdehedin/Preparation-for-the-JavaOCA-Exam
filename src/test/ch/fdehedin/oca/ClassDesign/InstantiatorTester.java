package ch.fdehedin.oca.ClassDesign;

import java.util.logging.Logger;

import ch.fdehedin.oca.Lambdas.ArrayLambdaTester;
import ch.fdehedin.oca.buildingblocks.MainFunctionTester;

public class InstantiatorTester {
	private static final Logger log = Logger.getLogger(ArrayLambdaTester.class.getSimpleName());

	final boolean test;
	final static boolean testStatic;

	{
		test = false;
		// testStatic = true;
		
	}

	static {
		testStatic = false;
		Object o = null;
		String s = o.getClass().getName();
		
	}

	public static void main(String[] args) {
		log.info("testStatic: " + testStatic);
		log.info("test: " + new InstantiatorTester().test);
		log.info("testStatic: " + testStatic);
	}

}
