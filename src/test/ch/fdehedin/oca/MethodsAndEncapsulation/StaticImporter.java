package ch.fdehedin.oca.MethodsAndEncapsulation;

//import static java.util.Arrays;//DOES NOT COMPILE
//we can only import static members or methods of a Class

//static import java.util.Arrays.asList;//DOES NOT COMPILE
//the order is always "import static.."

//right way:
import static java.util.Arrays.asList;
//or:
//import static java.util.Arrays.*;

public class StaticImporter {

	public static void main(String[] args) {
		System.out.println("list: " + asList(args));

		// System.out.println("list with array class: " + Arrays.asList(args));
		// does not compile!! since we don't import the Arrays class! only the
		// members....

	}

}
