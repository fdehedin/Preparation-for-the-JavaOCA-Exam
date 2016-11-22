package ch.fdehedin.oca.ClassDesign.interfaces;

import java.util.logging.Logger;

public interface InterfaceDefaultMethod1 {

	public static final Logger LOG = Logger.getLogger(InterfaceDefaultMethod1.class.getSimpleName());

	public default void doSomethingDefault(){
		LOG.info("inside something method 1");
	}
}
