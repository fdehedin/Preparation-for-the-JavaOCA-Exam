package ch.fdehedin.oca.ClassDesign.hiding.a;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class A {

	public int i = 10;
	
	public A() {

	}

	public int getInt(){
		return i;
	}
	
}