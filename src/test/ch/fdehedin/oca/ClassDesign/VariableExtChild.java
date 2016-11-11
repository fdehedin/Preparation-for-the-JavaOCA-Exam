package ch.fdehedin.oca.ClassDesign;

import java.util.logging.Logger;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class VariableExtChild extends VariableExtParent {

	private static final Logger LOGGER = Logger.getLogger(VariableExtChild.class.getName());
	protected int size = 1;

	public int getSize() {
		return this.size;
	}

	@Test
	public void testMethodsAndVariables() {
		VariableExtChild child = new VariableExtChild();

		// Method:
		assertThat(child.getSize(), is(1));
		// Variable:
		assertThat(child.size, is(1));

		VariableExtParent parent = new VariableExtParent();

		// Method:
		assertThat(parent.getSize(), is(0));
		// Variable:
		assertThat(parent.size, is(0));

		VariableExtParent parentChild = new VariableExtChild();

		// Method: OVERRIDEN
		assertThat(parentChild.getSize(), is(1));
		// Variable: PARENTs prop!!
		assertThat(parentChild.size, is(0));
	}

}
