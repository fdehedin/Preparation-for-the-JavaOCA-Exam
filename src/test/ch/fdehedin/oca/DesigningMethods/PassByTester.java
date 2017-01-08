package ch.fdehedin.oca.DesigningMethods;

public class PassByTester {
	public static void main(String[] args) {
		Foo f = new Foo("f");
		Foo f2 = new Foo("f2");
		modifyAndChangeReference(f, f2); // It won't change the reference!
		// changeReference(f); // It won't change the reference!
		System.out.println("in main, after changeReference:" + f + " f2: " + f2);
		// modifyReference(f); // It will modify the object that the reference
		// variable "f" refers to!
		// System.out.println("in main, after modifyReference:" + f + " f2: " +
		// f2);
	}

	public static void changeReference(Foo a) {
		System.out.println("in changeReference 1:" + a);
		// Foo b = new Foo("b");
		Foo b = new Foo("b");
		System.out.println("in changeReference 2:" + b);
		a = b;
		System.out.println("in changeReference 3:" + a);
	}

	public static void modifyAndChangeReference(Foo a, Foo b) {
		b.setAttribute("newB");
		a = b;
	}

	public static void modifyReference(Foo c) {
		c.setAttribute("c");
	}
}

class Foo {
	public String attribute;

	public Foo(String s) {
		this.attribute = s;
	}

	public void setAttribute(String s) {
		this.attribute = s;
	}

	public String toString() {
		return this.attribute + " (hashcode: " + this.hashCode();
	}
}