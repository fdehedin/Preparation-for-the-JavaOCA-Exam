package ch.fdehedin.oca.ClassDesign;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Rule;
import org.junit.Test;

public class ConstructorParamParent {

	int i;

	public ConstructorParamParent(int i) {
		this.i = i;
	}
 
	public int getIntFromParent() {
		return i;
	}

	public int getTestMethodInt() {
		return 0;
	}

	public double getSomething() throws IllegalArgumentException {
		return 0.0;
	}

	private void someting() {

	}

}

class ConstructorParamChild extends ConstructorParamParent {

	int i;

	// The following Constructor is needed, because the parent class has this
	// implicit constructor!
	// It doesn't need to have the same param tough..
	public ConstructorParamChild() {
		// also it must explicitly call the parents class constructor!
		super(2);

		// we can use super to access the parent class variable
		super.i = 3;
		i = 4;
	}

	// this one is overriding the parents class with same signature and return
	// type..
	public int getTestMethodInt() {
		return 0;
	}

	// We cannot introduce a new throw Exception when the parent class doesn't
	// throw something..
	// public int getTestMethodInt() throws Exception {
	// return 0;
	// }

	// This does not compile, since the overriding method is not returning the
	// same type!
	// public void getTestMethodInt(){
	// return 0;
	// }

	// Also the Exception must be compatible (cannot be broader)!
	// public double getSomething() throws Exception{
	// return 0.0;
	// }

	private void someting() {

	}

	public static void main(String[] args) {
		// when instantiating the child, we cannot use the parents constructor!
		ConstructorParamChild child = new ConstructorParamChild();

		// when instantiating the parent, of course we can only use the param
		// constructor!
		ConstructorParamParent parent = new ConstructorParamParent(10);

	}

	public int getParentClassIntFromChild() {
		return super.i;
	}

}