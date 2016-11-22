package ch.fdehedin.oca.exceptions;

import java.util.logging.Logger;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

import ch.fdehedin.oca.Lambdas.ArrayLambdaTester;

public class ExceptionTesterInheritance {
	private static final Logger log = Logger.getLogger(ArrayLambdaTester.class.getSimpleName());

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	public void test() {
		// try{
		eatCarrot();
		// unreachable code!!
		// }catch(CustomException e){
		//
		// }
	}

	public void ohNo() throws Throwable {
		// doesn't compile.. must be handled!
		throw new Exception("");

	}

	public void eatCarrot() {

	}

	public void good() throws CustomRuntimeException {

	}

	abstract class Hopper {
		public abstract void hop();
	}

	public void hop() throws CustomRuntimeException {

	}

}

class CustomException extends Exception {
}

class CustomRuntimeException extends RuntimeException {
}
