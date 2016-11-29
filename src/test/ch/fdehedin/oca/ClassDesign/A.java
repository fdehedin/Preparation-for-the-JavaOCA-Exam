package ch.fdehedin.oca.ClassDesign;

abstract public class A {
	int i;

	public A() {

	}

	public A(int b) {
		this.i = b;
	}

	public static void staticMethod() {

	}

	public void instanceMethod() {

	}

}

class B extends A {
	int j;

	Number b;

	public B(int x) {

	}

	public B(int x, int y) {
		super(x);
		this.j = y;
	};

	public final static void staticMethod() {

	}

}
