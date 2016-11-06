package ch.fdehedin.oca.MethodsAndEncapsulation;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.logging.Logger;

public class ConstructorCreater {

	private static final Logger log = Logger.getLogger(ConstructorCreater.class.getSimpleName());

	private String field = "field";
	private String field2 = "field2";

	public void ConstructorCreater() {
		// this is not a constructor of the class!
	}

	// private ConstructorCreater() {
	// use ful for classes with static methods.. so no one can instantiate an
	// object with this class.
	// }

	public ConstructorCreater(String field) {
		field = field;// has no effect!
		this.field = field;
		// field = this.field;// COMPILES, BUT NOT GOOD
		log.info("init field");
	}

	public ConstructorCreater(String field, String field2) {
		this(field);
		this.field2 = field2;
		log.info("init field2");
		// this(field);//DOES NOT COMPILE! it must be the first statement in a
		// constructor
	}

	public static void main(String[] args) {
		new ConstructorCreater("test");
		new ConstructorCreater("test", "test2");
	}
}
