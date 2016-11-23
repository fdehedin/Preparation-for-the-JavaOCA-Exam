package ch.fdehedin.oca.ClassDesign.hiding.b;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import ch.fdehedin.oca.ClassDesign.hiding.a.A;

public class B extends A {

	B() {
		// this is wrong, since the constructor of the parent class is "default"
		// -> not visible due to other package!
		super();
	}

}
