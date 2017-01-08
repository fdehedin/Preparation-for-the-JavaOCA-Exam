package ch.fdehedin.oca.ClassDesign.interfaces;

import java.util.logging.Logger;

import ch.fdehedin.oca.CoreJavaApis.WrapperAndAutoboxer;

//the "abstract" keyword is actualy obsolete, it will be added by the compiler anyway
public abstract interface InterfaceTest2Extend {

	int amount = 10;
	
	public static final Logger LOG = Logger.getLogger(InterfaceTest2Extend.class.getSimpleName());

	//same like in classes: cannot override a default interface method with different return type!
	//public default boolean doSomethingDefault() {
	//	LOG.info("inside something default");
	//} 
	public default void doSomethingDefault(){
		LOG.info("inside something default");
	}
}
