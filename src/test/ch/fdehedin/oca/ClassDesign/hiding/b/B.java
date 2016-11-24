package ch.fdehedin.oca.ClassDesign.hiding.b;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import ch.fdehedin.oca.ClassDesign.hiding.a.A;

public class B extends A {

	public int i = 20;
	
	public B() {
		super();
		//IF THE CONSTRUCTOR IS DEFAULT ACCESS (NO MODIFIER)
		// this is wrong, since the constructor of the parent class is "default"
		// -> not visible due to other package!
		
	}
 
	public int getInt(){
		return i;
	}
	
}
