package ch.fdehedin.oca.ClassDesign.hiding;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class Penguin extends Bird {

	public boolean isCanFly() {
		return false;
	}

	@Test
	public void testFly() {
		Penguin wonder = new Penguin();
		assertThat(wonder.isCanFly(), is(false));
	}

	// it won't compile with Override, since this is NOT a override, because we
	// do not have the same params like the overriden class
	// @Override
	public void testFly(boolean b) {

	}
}
