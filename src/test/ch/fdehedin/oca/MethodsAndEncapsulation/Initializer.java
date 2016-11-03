package ch.fdehedin.oca.MethodsAndEncapsulation;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.logging.Logger;

public class Initializer {
	private static final String[] cage = new String[2];
	private static final Logger log = Logger.getLogger(Initializer.class.getSimpleName());

	@Test
	public void testStaticArray() {
		Initializer i1 = new Initializer();

		// let's fill the cage with animals (altough i'd rather see them in
		// freedom)
		// we set them into the static FINAL array..and see in the Instance
		// Variable, how they're filled...
		// we can fill a FINAL array, but we cannot reassign the final cage..
		cage[0] = "lion";
		cage[1] = "tiger";

		Initializer i2 = new Initializer();
		log.info("in the cage are: " + i2.getCageContent());
		assertThat(i2.getCageContent(), equalTo("[lion, tiger]"));
	}

	public String getCageContent() {
		return Arrays.toString(cage);
	}


	
}
