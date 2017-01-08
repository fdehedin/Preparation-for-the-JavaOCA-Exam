package ch.fdehedin.oca.ClassDesign;

import java.util.logging.Logger;

public class VariableParent {

	private static final Logger LOGGER = Logger.getLogger(VariableParent.class.getName());

	protected int size = 0;

	public void showSizeParent(){
		LOGGER.info("size of parent: "+size);
	}
	
	
	public void showSize(){
		LOGGER.info("size of parent: "+size);
	}
	
	

}
