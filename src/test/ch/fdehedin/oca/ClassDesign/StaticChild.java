package ch.fdehedin.oca.ClassDesign;

import java.util.logging.Logger;

import ch.fdehedin.oca.DesigningMethods.PassByValueTester;

public class StaticChild extends StaticParent {

	private static final Logger LOGGER = Logger.getLogger(StaticChild.class.getName());

	public static void parentTest() {
		StaticParent.parentTest();
		LOGGER.info("i am Child Static");
	}

	public static final void main(String[] args) {
		parentTest();
	}

	// DOES NOT COMPILE, since the parent has a static method with same
	// signature
	// public void stupidTest1(){
	//
	// }

	//DOES NOT COMPILE, since the parent class has a same non static method.
	//public static void stupidTest2(int i) {
//
	//}
}
