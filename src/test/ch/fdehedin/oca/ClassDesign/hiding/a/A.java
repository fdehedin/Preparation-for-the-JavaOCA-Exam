package ch.fdehedin.oca.ClassDesign.hiding.a;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.IOError;

import org.junit.Test;

public class A {

	public int i = 10;

	// cannot be protected when using in antoher package!!
	// A() {
	public A() {

	}

	public Object getInt() throws RuntimeException {

		return i;
	}
}
