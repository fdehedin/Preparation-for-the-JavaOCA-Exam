package ch.fdehedin.test.chapter1;

public class VariableTester {
	VariableTester() {
		System.out.print("c ");
	}

	{
		System.out.print("y ");
	}

	public static void main(String[] args) {
		new VariableTester().go();
	}

	void go() {
		System.out.print("g ");
	}

	static {
		System.out.print("x ");
	}
}
