package ch.fdehedin.oca.ClassDesign.interfaces;

public class Implement2Interfaces implements InterfaceDefaultMethod1, InterfaceDefaultMethod2 {

	public static void main(String[] args) {
		InterfaceDefaultMethod1 t = new Implement2Interfaces();
		t.doSomethingDefault();
	}
	

}
