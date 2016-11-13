package ch.fdehedin.oca.ClassDesign.interfaces;

//the "abstract" keyword is actualy obsolete, it will be added by the compiler anyway
public abstract interface InterfaceTest {

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
	
	//we cannot provide method signature with different return type!
	//when a class is implementing those interfaces, it will not compile..
//	public Integer getInt();
}
