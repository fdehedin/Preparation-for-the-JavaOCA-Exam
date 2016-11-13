package ch.fdehedin.oca.ClassDesign.hiding;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class Penguin extends Bird{

	public boolean isCanFly(){
		return false;
	}
	
	@Test
	public  void testFly() {
		Penguin wonder = new Penguin();
		assertThat(wonder.isCanFly(), is(false));
	}
}
