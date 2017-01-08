package ch.fdehedin.oca.ClassDesign.interfaces2;

import java.util.logging.Logger;

public class A implements I1, I2, I3 {
	public static final Logger log = Logger.getLogger(A.class.getSimpleName());

	public static void main(String[] args) {

		// will print interface 2 default method!!
		I2 i2 = new A();
		i2.doSomething();

		// Will print interface 2 default method!
		I1 i1 = new A();
		i1.doSomething();

		// Will print interface 3 default method!
		I3 i3 = new A();
		i3.doSomething();

		// Interface 2!!!
		System.out.println("i1:" + i1.doSomething());
		System.out.println("i2:" + i2.doSomething());

		// 1
		System.out.println("i1.i:" + i1.i);

		// 2
		System.out.println("i2.i:" + i2.i);

	}

	
	public Integer doSomething() {
		return 1;
	}

}

interface I3 extends I2, I1 {
	public static final Logger log = Logger.getLogger(I3.class.getSimpleName());

	@Override
	public abstract Integer doSomething();
}

interface I2 extends I1 {
	public static final Logger log = Logger.getLogger(I2.class.getSimpleName());

	public static final int i = 2;

	default Integer doSomething() {
		log.info("something in interface 2");
		return 2;
	}
}

interface I1 {
	public static final Logger log = Logger.getLogger(I1.class.getSimpleName());
	public static final int i = 1;

	default Integer doSomething() {
		log.info("something in interface");
		return 1;
	}
}
