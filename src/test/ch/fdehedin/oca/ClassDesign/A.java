package ch.fdehedin.oca.ClassDesign;

public class A {
	int i;

	public A(int x) {
		this.i = x;
	}

}

class B extends A {
	int j;

	Number b;

	public B(int x, int y) {
		super(x);
		this.j = y;
	}
}
