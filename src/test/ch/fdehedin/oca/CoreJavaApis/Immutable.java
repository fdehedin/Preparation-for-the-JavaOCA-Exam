package ch.fdehedin.oca.CoreJavaApis;

final public class Immutable {

	private String s = "name";

	// no way to set the internal prop! -> immutable;

	public String getS() {
		return s;
	}

}
