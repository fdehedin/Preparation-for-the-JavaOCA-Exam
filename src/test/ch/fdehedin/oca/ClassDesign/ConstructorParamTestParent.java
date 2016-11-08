package ch.fdehedin.oca.ClassDesign;

public class ConstructorParamTestParent {

	int i;

	public ConstructorParamTestParent(int i) {
		this.i = i;
	}

}

class ConstructorParamTestChild extends ConstructorParamTestParent {

	// The following Constructor is needed, because the parent class has this
	// implicit constructor!
	// It doesn't need to have the same param tough..
	public ConstructorParamTestChild() {
		// also it must explicitly call the parents class constructor!
		super(2);
	}

	public static void main(String[] args) {
		// when instantiating the child, we cannot use the parents constructor!
		ConstructorParamTestChild child = new ConstructorParamTestChild();

		// when instantiating the parent, of course we can only use the param
		// constructor!
		ConstructorParamTestParent parent = new ConstructorParamTestParent(10);
	}

}