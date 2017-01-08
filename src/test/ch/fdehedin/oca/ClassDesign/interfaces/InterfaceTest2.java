package ch.fdehedin.oca.ClassDesign.interfaces;

import java.util.logging.Logger;

import ch.fdehedin.oca.CoreJavaApis.WrapperAndAutoboxer;

//the "abstract" keyword is actualy obsolete, it will be added by the compiler anyway
public abstract interface InterfaceTest2 {

	public static final Logger LOG = Logger.getLogger(InterfaceTest2.class.getSimpleName());

	// same with "abstract" here..
	public abstract void method();

	// doesn't compile..
	// protected void protectedMethod();
	// private void privateMethod();

	// new in java8: default..
	void defaultMethod();

	// new in java8: static methods (with Body!)
	static void staticMethod() {
		System.out.println("method of an interface!");
	}

	public int getInt();

	public default void doSomethingDefault(){
		LOG.info("inside something default");
	}
	
	public default void doSomethingOtherDefault(){
		LOG.info("inside something other default");
	}

}
