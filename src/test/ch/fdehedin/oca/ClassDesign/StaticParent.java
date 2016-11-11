package ch.fdehedin.oca.ClassDesign;

import java.util.logging.Logger;

import ch.fdehedin.oca.DesigningMethods.PassByValueTester;

public class StaticParent {

	private static final Logger LOGGER = Logger.getLogger(StaticParent.class.getName());

	public static void parentTest() {
		LOGGER.info("i am Parent Static");
	}
	
	public static void stupidTest1(){
		
	}
	
	public void stupidTest2(int i){
		
	}

}
