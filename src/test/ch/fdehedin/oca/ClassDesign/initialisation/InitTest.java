package ch.fdehedin.oca.ClassDesign.initialisation;

//THIS WILL RETURN:

public class InitTest {

	public InitTest() {
		// the last! since before it will init the default values of the
		// memebers..
		s1 = sM1("1"); // 6
	}

	// YES, this is valid!
	static String s1 = sM1("a"); // 1
	String s3 = sM1("2"); // 4
	{
		// instance init..
		s1 = sM1("3"); // 5
	}
	static {
		s1 = sM1("b"); // 2
	}

	// YES, also this is valid!
	static String s2 = sM1("c"); // 3

	// YES, also this is valid!
	String s4 = sM1("4"); // 5

	public static void main(String args[]) {
		InitTest it = new InitTest();
	}

	private static String sM1(String s) {
		System.out.println(s);
		return s;
	}
}