package ch.fdehedin.oca.MethodsAndEncapsulation;

import java.util.logging.Logger;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MethodParamTester {

	private static final Logger log = Logger.getLogger(MethodParamTester.class.getSimpleName());

	@Test
	public void simplePrimitivePasser() {
		int number = 10;
		this.setNumber(number);
		assertThat(number, is(10));

		int anotherVariableName = number;
		this.setNumber(anotherVariableName);
		assertThat(number, is(10));
		// Still 10, because we're always reassigning the int..
	}

	private void setNumber(int number) {
		number = 20;
	}

	@Test
	public void simpleStringPasser() {
		String name = "Anna";
		this.changeThatString(name);
		assertThat(name, is("Anna"));/// name didn't change at all!
	}

	private void changeThatString(String name) {
		name = "Berta";
	}

	@Test
	public void objectPasser(){
		StringBuilder sb = new StringBuilder("Debby");
		this.changeThatObject(sb);
		assertThat(sb.toString(), equalTo("Debby Harris"));
		
		this.reassignThatObject(sb);
		assertThat(sb.toString(), equalTo("Debby Harris"));
	}
	
	private void changeThatObject(StringBuilder sb2000){
		sb2000.append(" ").append("Harris");
	}
	
	private void reassignThatObject(StringBuilder sb){
		sb = new StringBuilder("Nena");
		assertThat(sb.toString(), equalTo("Nena"));
	}
}
