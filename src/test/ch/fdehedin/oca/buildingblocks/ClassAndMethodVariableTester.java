package ch.fdehedin.oca.buildingblocks;

public class ClassAndMethodVariableTester {

	static int y;
	int i;

	public static void main(String[] args) {
		int i;

		if (!"TEST".equals("")) {
			// that doesn't help, we cannot garantuee that the i is
			// initiailzed..
			i = 1;
		}

		// This does not work, since the "i" is not initialized in the current
		// block!
		// System.out.println("i:" + i);

	}

}
