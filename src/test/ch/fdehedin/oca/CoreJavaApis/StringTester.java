package ch.fdehedin.oca.CoreJavaApis;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class StringTester {

	@Test
	public void testNull() {
		String s = null;
		s = s + "TEST";
		assertThat(s.equals("nullTEST"), is(true));
		assertThat(s, equalTo("nullTEST"));
		assertThat(s == "nullTEST", is(false));

	}

	@Test
	public void testConcat() {
		String s = "";
		// left assoziation..
		s = 2 + 3 + "4";
		assertThat(s.equals("54"), is(true));

		s = "5" + 4 + 3;
		assertThat(s.equals("543"), is(true));

		// does NOT COMPILE
		// s = null + 5;
		s = null + "5";
		assertThat(s.equals("null5"), is(true));

		// Logic!! char 'a' will be an int (97) and 0 will be added..;
		s = String.valueOf('a' + 0);
		assertThat(s, equalTo("97"));
	}

	@Test
	public void testChainedReplace() {
		// TRUE!!!!! because java didn't even change anything!
		assertThat("String".replace('g', 'g') == "String", is(true));
		
		// FALSE!! because java did change something in the string -> new object!
		assertThat("String".replace('g', 'x').replace('x', 'g') == "String", is(false));
	}

	@Test
	public void testFunctions() {
		String a = "oioiueoiueroiueoiroijfdsaoiajdfoisajfdoiadk ok ooioiueoiueroiueoiroijfdsaoiajdfoisajfdoiadk ok ooioiueoiueroiueoiroijfdsaoiajdfoisajfdoiadk ok ooioiueoiueroiueoiroijfdsaoiajdfoisajfdoiadk ok ooioiueoiueroiueoiroijfdsaoiajdfoisajfdoiadk ok ooioiueoiueroiueoiroijfdsaoiajdfoisajfdoiadk ok ooioiueoiueroiueoiroijfdsaoiajdfoisajfdoiadk ok oko k ok ok";
		char c = a.charAt('a');
		assertThat(String.valueOf(c), equalTo("i"));

		String nuller = "" + null + null;
		assertThat(nuller, equalTo("nullnull"));

		// throws an IndexOutOfBoundsException
		c = a.charAt(10000);
	}

	@Test
	public void testCompare() {
		String s1 = "Hello";
		String s2 = "H" + "ello";
		assertThat(s1 == s2, is(true));
		assertThat(s1.equals(s2), is(true));

		String s3 = "H";
		s3 = s3.concat("ello");
		String s4 = "ello";

		// FALSE FALSE
		assertThat(s1 == s3, is(false));

		// TRUE TRUE
		assertThat(s1 == s3.intern(), is(true));

		assertThat(s1 + s4 == s1, is(false));

		assertThat((s1 + s4).intern() == s1.intern(), is(false));

	}

}
