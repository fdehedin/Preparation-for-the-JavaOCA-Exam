package ch.fdehedin.oca.OperatorsAndStatements;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;

public class LoopStatementer {

	private static final Logger log = Logger.getLogger(LoopStatementer.class.getSimpleName());

	@Test
	public void whileLoop() {
		int bitesOfCheese = 20;
		int roomInBelly = 10;

		while (bitesOfCheese > 0 && roomInBelly > 0) {
			bitesOfCheese--;
			roomInBelly--;
		}
		log.info(String.format("the mouse left %d bites left..", bitesOfCheese));
	}

	/**
	 * Do while loop test: statement will be called at least once!
	 */
	@Test
	public void doWhileLoop() {
		int i = 0;
		do {
			i--;
		} while (false);
		assertThat(i, is(-1));
	}

	@Test
	public void forLoop() {
		int[] arr = new int[10];
		String s = "";
		for (int i = 0; i < arr.length; i++) {
			s += Integer.toString(i);
		}
		log.info(s);
		assertThat(s.length(), is(10));

		// more complex, but actually simple variable initialitation with
		// commas..
		// int z = 0; //DOES NOT COMPILE
		for (int y = 0, z = 0; y < 3; z++, y++) {
			log.info(String.format("y=%s, z=%s", y, z));
		}
		// log.info(y); DOES NOT COMPILE, because it's not in the same block..

		// does not compile.. must be the same data type or initialized outside
		// the loop..
		// for (long l = 0L, short u = 0;;) {

		// }

		/*
		 * This is an infinite loop! for (;;) { log.info("i'll print forever");
		 * }
		 */

		/*
		 * This doesn't compile! for(){
		 * 
		 * }
		 */

	}

	@Test
	public void forEachLoop() {

		String[] names = new String[3];
		for (int i = 0; i < 3; i++) {
			names[i] = "name:" + i;
		}

		for (String name : names) {
			log.info(name + ",");
		}

		String[] nullNames = new String[3];
		for (String name : nullNames) {
			log.info(name + ",");
		}

		// same same, but different.
		List<String> nameList = new ArrayList<String>();
		nameList.add("Hans");
		nameList.add("Jakob");
		for (Iterator<String> i = nameList.iterator(); i.hasNext();) {
			log.info(i.next());
		}

	}

}
