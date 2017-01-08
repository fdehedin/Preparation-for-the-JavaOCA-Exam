package ch.fdehedin.oca.ClassDesign.interfaces;

import java.util.logging.Logger;

public interface InterfaceDefaultMethod2 extends InterfaceDefaultMethod1{

	public static final Logger LOG = Logger.getLogger(InterfaceDefaultMethod2.class.getSimpleName());

	public default void doSomethingDefault(){
		LOG.info("inside something method 2");
	}
}
