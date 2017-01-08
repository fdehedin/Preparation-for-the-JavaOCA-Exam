package ch.fdehedin.oca.ClassDesign.hiding;

class Parent {
	public String name = "variable A";

	public String getAnotherName() {
		return "method A";
	}
}

class Child extends Parent {
	public String name = "variable B";

	public String getAnotherName() {
		return "method B";
	}
}
 
public class ParentChildTester{
	
	public static void main(String[] args) {
		Parent parent = new Child();
		System.out.println("parent.name:"+parent.name);
		System.out.println("parent.getAnotherName:"+parent.getAnotherName());	
	}
}
