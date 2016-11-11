package ch.fdehedin.oca.ClassDesign.interfaces;

//the "abstract" keyword is actualy obsolete, it will be added by the compiler anyway
public abstract interface InterfaceTest2 {

	//same with "abstract" here..
	public abstract void method();
	
	//doesn't compile.. 
	//protected void protectedMethod();
	//private void privateMethod();
	
	//new in java8: default..
	void defaultMethod();
	
	//new in java8: static methods (with Body!)
	static  void staticMethod(){
		System.out.println("method of an interface!");
	}
	
	public int getInt();
}
