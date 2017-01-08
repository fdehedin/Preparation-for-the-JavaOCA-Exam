package ch.fdehedin.oca.Lambdas;

@FunctionalInterface
public interface MathOperation {

	public abstract int operation(int a, int b);

	// we cannot have other abstract methods
	// public int somethingElse();

	// we can use Object methods..
	public String toString();

	// we can use Default methods..
	public default String getThisString() {
		return "THISTHISTHIS";
	}

	// we can use static methods..
	static String getStaticString() {
		return "ASTATIC THISTHISTHIS";
	}

}
