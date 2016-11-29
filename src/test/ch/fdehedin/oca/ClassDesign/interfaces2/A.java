package ch.fdehedin.oca.ClassDesign.interfaces2;

import java.util.logging.Logger;

public class A implements I1 {
	public static final Logger log = Logger.getLogger(A.class.getSimpleName());

	public static void main(String[] args) {

	}
}

interface I1 {
	public static final Logger log = Logger.getLogger(I1.class.getSimpleName());

	default void doSomething() {

	}

}
