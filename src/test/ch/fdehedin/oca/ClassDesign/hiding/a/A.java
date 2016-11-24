package ch.fdehedin.oca.ClassDesign.hiding.a;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class A {

	// cannot be protected when using in antoher package!!
	// A() {
	public A() {

	}

	public int getInt() {
		return 1;
	};

}
