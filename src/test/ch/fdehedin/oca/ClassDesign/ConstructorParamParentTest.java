package ch.fdehedin.oca.ClassDesign;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Rule;
import org.junit.Test;

public class ConstructorParamParentTest {

	@Test
	public void testParam() {
		ConstructorParamChild child = new ConstructorParamChild();
		assertThat(child.i, is(4));

		// altough they have the same name, it will truly return the parents
		// variable vaue
		assertThat(child.getParentClassIntFromChild(), is(3));
		
		assertThat(child.getIntFromParent(), is(3));
	}

}
