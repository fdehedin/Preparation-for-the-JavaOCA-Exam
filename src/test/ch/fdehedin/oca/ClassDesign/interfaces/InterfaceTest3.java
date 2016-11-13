package ch.fdehedin.oca.ClassDesign.interfaces;

import java.util.logging.Logger;

import ch.fdehedin.oca.CoreJavaApis.WrapperAndAutoboxer;

//the "abstract" keyword is actualy obsolete, it will be added by the compiler anyway
public abstract interface InterfaceTest3 {

	public static final Logger LOG = Logger.getLogger(InterfaceTest3.class.getSimpleName());

	public default void doSomethingDefault(String something) {
		LOG.info("inside something:" + something);

	}

	// static methods in interfaces must have a body!
	// static void Method();

	public default void doSomethingDefault() {
		LOG.info("inside something default");

	}

	// new in java8: static methods (with Body!)
	static void staticMethod() {
		System.out.println("method of an interface!");
	}

}
