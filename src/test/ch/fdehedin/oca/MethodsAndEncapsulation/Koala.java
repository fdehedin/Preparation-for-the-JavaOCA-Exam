package ch.fdehedin.oca.MethodsAndEncapsulation;

import java.util.logging.Logger;

import ch.fdehedin.oca.DateAndTimes.PeriodTester;

public class Koala {

	private static final Logger log = Logger.getLogger(Koala.class.getSimpleName());

	public int countInstance = 0;

	public static int count = 0;
	
	public static void main(String[] args) {
		log.info("count:"+count);
		
		//we can't call an instance method out of a static method.
		//instanceMethod();
	}
	
	public Koala(){
		Koala.count++;
		log.info("creating a Koala, we have now "+count);
	}
	
	public void instanceMethod(){
		log.info("inside instance method.."+count);
		
		//we can call a static method out of an instance method!
		main(null);
	}

}
