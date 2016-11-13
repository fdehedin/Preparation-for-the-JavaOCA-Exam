package ch.fdehedin.oca.ClassDesign.polymorphism;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Testing {
	@Rule
	public final ExpectedException exception = ExpectedException.none();


	@Test
	public void testVirtualMethods() {
		SuperClass superClassObj = new SubClass(null);
		assertThat(superClassObj.getName(), equalTo("Sub Class"));
		
		//this will case an exception!
		exception.expect(ClassCastException.class);
		AnotherSubClass sb = (AnotherSubClass)superClassObj;
	}

}
