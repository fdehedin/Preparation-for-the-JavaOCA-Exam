package ch.fdehedin.oca.ClassDesign;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.logging.Logger;

import org.junit.Test;

import ch.fdehedin.oca.DesigningMethods.PassByValueTester;

public class ConstructorTestChild extends ConstructorTestParent {

	private static final Logger LOGGER = Logger.getLogger(PassByValueTester.class.getName());

	public ConstructorTestChild() {
		i++;
	}

	@Test
	public void testParentVariable() {
		assertThat(this.i, is(2));
		LOGGER.info("it is " + i
				+ " because this class will automatically call the parent class constructor! so 2 times 1 addition..");
	}

}
