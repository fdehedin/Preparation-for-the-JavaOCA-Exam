package ch.fdehedin.oca.exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import ch.fdehedin.oca.Lambdas.ArrayLambdaTester;
import ch.fdehedin.oca.exceptions.MultiExceptionTester.CustomException;

public class ExceptionTesterInheritance {
	private static final Logger log = Logger.getLogger(ArrayLambdaTester.class.getSimpleName());

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	public void test() {
<<<<<<< HEAD
	//	try{
=======
		try {
>>>>>>> branch 'master' of https://github.com/fdehedin/Preparation-for-the-JavaOCA-Exam.git
			eatCarrot();
<<<<<<< HEAD
			//unreachable code!!
	//	}catch(CustomException e){
	//		
	//	}
=======
		} catch (CustomRuntimeException e) {

		}
	}

	public void ohNo() throws Throwable {
		// doesn't compile.. must be handled!
			throw new Exception("");
		
>>>>>>> branch 'master' of https://github.com/fdehedin/Preparation-for-the-JavaOCA-Exam.git
	}

	public void eatCarrot() {

	}

	public void good() throws CustomRuntimeException {

	}

	abstract class Hopper {
		public abstract void hop();
	}

	class Bunny extends Hopper {

		@Override
		public void hop() throws CustomRuntimeException {

		}

	}

	class CustomException extends Exception {
	}

	class CustomRuntimeException extends RuntimeException {
	}

}
