package ch.fdehedin.oca.ClassDesign;

import java.util.logging.Logger;

public class VariableChild extends VariableParent {

	private static final Logger LOGGER = Logger.getLogger(VariableChild.class.getName());
	protected int size = 1;

	public void showSizeChild() {
		LOGGER.info("size of child: " + size);
	}

	public void showSize() {
		LOGGER.info("size of child: " + size + ", size of parent: " + super.size);
	}

	public static void main(String[] args) {
		VariableChild child = new VariableChild();
		child.showSize();
		child.showSizeChild();
		child.showSizeParent();

		VariableParent parentChild = new VariableChild();

		parentChild.showSize();// calls the child method! Acts like an
								// interface! BUT BEWARE OF DIRECT ACCESS TO
								// VARIABLES!
		// parentChild.showSizeChild(); can't because it is actually a parent..
		parentChild.showSizeParent();
		LOGGER.info("the size tough is: " + parentChild.size);// this shows 0
																// (parent
																// class)
	}

}
