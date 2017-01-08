package ch.fdehedin.oca.Lambdas;

@FunctionalInterface
public interface MathOperationBool {

	public abstract boolean check(int a);

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
