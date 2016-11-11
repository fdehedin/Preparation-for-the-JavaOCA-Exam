package ch.fdehedin.oca.ClassDesign;

import java.util.logging.Logger;

public class VariableExtParent {

	private static final Logger LOGGER = Logger.getLogger(VariableExtParent.class.getName());

	protected int size = 0;

	public int getSize(){
		return this.size;
	}

}
