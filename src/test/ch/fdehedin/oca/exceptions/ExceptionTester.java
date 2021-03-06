package ch.fdehedin.oca.exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;

import ch.fdehedin.oca.Lambdas.ArrayLambdaTester;

public class ExceptionTester {
	private static final Logger log = Logger.getLogger(ArrayLambdaTester.class.getSimpleName());

	public static void main(String[] args) {
		try {
			fall();
		} catch (RuntimeException e) {
			log.log(Level.SEVERE, "", e);
		} catch (Exception e) {
			log.log(Level.SEVERE, "", e);
		} finally {
			log.info("no we're in finally..");
		}

		// when catching, we need to check the MORE DETAILLED exception first
		try {
			fall();
		} catch (RuntimeException e) {
			log.log(Level.SEVERE, "runtime", e);
		} catch (Exception e) {
			log.log(Level.SEVERE, "some other exception", e);
		} finally {
			log.info("no we're in finally..");
			fallRunTime();
		}

		// and not the other way round:
		try {
			fall();
		} catch (Exception e) {
			log.log(Level.SEVERE, "runtime", e);
			// DOES NOT COMPILE.. unreachable!!!!!
			// } catch (RuntimeException e) {
			// log.log(Level.SEVERE, "some other exception", e);
		} finally {
			log.info("no we're in finally..");
		}

	}

	@Test
	public static void fall() throws Exception {
		try {
			log.info("zero div:" + 0 / 0);
		} catch (NullPointerException e) {
			log.info("catch:" + e);
		} finally {
			log.info("finally");
		}
		log.info("finally");
	}

	public static void callFallRuntime() {
		fallRunTime();
		try {
			//the fall thrower must bei catched!! (checked exception)
			fallThrower();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void fallRunTime() throws RuntimeException {
	}
	
	public static void fallThrower() throws Throwable {
	}

}