package ch.fdehedin.oca.ClassDesign.interfaces;

public class InterfaceTestImpl implements InterfaceTest, InterfaceTest2, InterfaceTest3 {

	@Override
	public void method() {
		// TODO Auto-generated method stub

	}

	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		InterfaceTest.staticMethod();

		InterfaceTestImpl impl = new InterfaceTestImpl();
		// calling interface method..
		impl.doSomethingDefault();
	}

	@Override
	public int getInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	// When an interface has a default method with the same signature, the
	// implementing class dies not compile, unless it overides the conflicting
	// method..
	// the interfaces default method(s) cann still be called like so:
	@Override
	public void doSomethingDefault() {
		InterfaceTest2.super.doSomethingDefault();
		InterfaceTest3.super.doSomethingDefault();
	}

}
