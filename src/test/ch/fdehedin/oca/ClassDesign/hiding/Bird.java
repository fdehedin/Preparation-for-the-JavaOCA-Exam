package ch.fdehedin.oca.ClassDesign.hiding;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class Bird {

public Bird(int i){
	
}
	
	int x = 10;
	static int y = 20;

	
	private boolean isCanFly() {
		return true;
	}

	public static void init() {
		System.out.println(Bird.class.toString());
	}

	@Test
	public void testFly() {
		Bird wonder = new Penguin("");

		// this is a special case! but actually logic..
		// the method "isCanFly" is private on Bird.. so it actually can only be
		// called becase WE ARE IN BIRD.. so we call this method directly, and
		// not the Penguins "isCanFly" method!
		assertThat(wonder.isCanFly(), is(true));
	}

	public Number getNumberOfWings() {
		return 2;
	};

}
