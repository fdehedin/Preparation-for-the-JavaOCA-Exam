package ch.fdehedin.oca.MethodsAndEncapsulation;

public class KoalaTester {

	public static void main(String[] args) {
		Koala.main(new String[0]);

		Koala k = new Koala();
		k.main(null);

		k = null;

		// k is NOT null
		// remember: when calling a static method, from a CLASS or OBJECT, it
		// will work! not good practice tough, even the compiler warns about
		// that..
		k.main(null);

		// now let's feed the static member and create 20 Koalas!
		k.count = 20;
		//create a new object.
		Koala k2 = new Koala();
		
		// this will print 21, since we altered the SINGLE existing static
		// member!
		k.main(null);

		// this will throw a nullpointer!
		// k.instanceMethod();
	}

}
