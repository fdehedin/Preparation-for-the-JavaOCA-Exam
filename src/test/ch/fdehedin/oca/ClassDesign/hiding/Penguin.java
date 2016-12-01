package ch.fdehedin.oca.ClassDesign.hiding;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class Penguin extends Bird {

	static String s = "s";
	final int x = 30;
	static int y = 40;

	public Penguin(String s) {
		super(1);
		s = "test";
		
	
	}

	public static void init() {
		System.out.println(Penguin.class.toString());
	}

	public boolean isCanFly() {
		return false;
	}

	@Test
	public void testFly() {
		Penguin wonder = new Penguin("");
		assertThat(wonder.isCanFly(), is(false));
	}

	// it won't compile with Override, since this is NOT a override, because we
	// do not have the same params like the overriden class
	// @Override
	public void testFly(boolean b) {

	}

	public Integer getNumberOfWings() {
		return 1;
	};

	@Test
	public void testVariables() {
		Bird bird = new Penguin("");
		assertThat(bird.x == 10, is(true));
		assertThat(bird.y == 20, is(true));

		Penguin penguin = new Penguin("");
		assertThat(penguin.x == 30, is(true));
		assertThat(penguin.y == 40, is(true));

		bird = penguin;
		assertThat(penguin.x == 30, is(true));
		assertThat(penguin.y == 40, is(true));
	}
	
}
