package ch.fdehedin.oca.OperatorsAndStatements;

import java.util.logging.Logger;

/**
 * @author fdehedin
 *
 */
public class ModulusTester {

	private static final Logger log = Logger.getLogger(ModulusTester.class.getName());

	public static void main(String[] args) {
		new ModulusTester().modulus(2323, 34);
	}

	/**
	 * displays the modulus of 2 int values. Modulus could be used also to check
	 * if a number is even or odd.. i used it many times when displaying odd row
	 * colors.. Tip: to display percentage sign in String.Format, simply use %%
	 * double percentage signs..
	 * 
	 * @param n
	 * @param i
	 */
	public void modulus(int n, int i) {
		log.info(String.format("The modulus of %s %% %s is %s", n, i, n % i));
	}

}
