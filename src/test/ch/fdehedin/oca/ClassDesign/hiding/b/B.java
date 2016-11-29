package ch.fdehedin.oca.ClassDesign.hiding.b;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import ch.fdehedin.oca.ClassDesign.hiding.a.A;

public class B extends A {

	public int i = 20;

	public B() {

	}

	@Override
	public Integer getInt() {
		//

		return i;
	}

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A ab = new B();

		System.out.println("a: " + a.getInt()); // 10
		System.out.println("b: " + b.getInt()); // 20
		System.out.println("ab: " + ab.getInt()); // 20

		System.out.println("a.i: " + a.i); // 10
		System.out.println("b.i: " + b.i); // 20
		System.out.println("ab.i: " + ab.i); // 10!!!!!!!
	}

}
