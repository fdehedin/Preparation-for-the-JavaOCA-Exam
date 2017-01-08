package ch.fdehedin.oca.ClassDesign.hiding;

import ch.fdehedin.oca.ClassDesign.hiding.b.B;
import ch.fdehedin.oca.ClassDesign.hiding.a.A;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class Tester {
 
	@Test
	public void testInheritance()
	{
		A a = new A();
		B b = new B();
		a = b;
		assertThat(a.getClass().getSimpleName(), equalTo("B"));
		assertThat(b.getClass().getSimpleName(), equalTo("B"));
		
		A a2 = new B();
		A a3 = (A)a2;
		assertThat(a2.i, is(10));
		assertThat(a2.getInt(), is(20));
		assertThat(a3.i, is(10));
		assertThat(a3.getInt(), is(20));
		
	}

}
