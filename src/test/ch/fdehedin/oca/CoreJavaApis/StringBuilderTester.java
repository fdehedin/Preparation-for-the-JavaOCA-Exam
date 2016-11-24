package ch.fdehedin.oca.CoreJavaApis;

import java.util.logging.Logger;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Assert;
import org.junit.Rule;

import java.util.logging.Logger;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author juiceterry
 *
 */
public class StringBuilderTester {

	private static final Logger log = Logger.getLogger(StringPooler.class.getSimpleName());

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void testImmutableString() {
		String alpha = "";
		int hashCodeRemember = alpha.hashCode();
		for (char current = 'a'; current <= 'z'; current++) {
			hashCodeRemember = alpha.hashCode();
			log.info("hashcode of alpha string:" + hashCodeRemember);

			// this will generate always a completely new object! and previous
			// one is eligle for garbage collection.. unefficient..
			alpha += current;

			assertThat(alpha.hashCode(), not(is(hashCodeRemember)));
		}
	}

	@Test
	public void testMutableStringBuilder() {
		StringBuilder alpha = new StringBuilder("");
		int hashCodeRemember = alpha.hashCode();
		for (char current = 'a'; current <= 'z'; current++) {
			hashCodeRemember = alpha.hashCode();
			log.info("hashcode of alpha stringbuilder:" + hashCodeRemember);

			// alpha will remain the same object!
			alpha.append(current);

			assertThat(alpha.hashCode(), is(hashCodeRemember));
		}
	}

	@Test
	public void testSubstring() {
		StringBuilder sb = new StringBuilder("abcdefg");
		exception.expect(StringIndexOutOfBoundsException.class);
		sb.substring(5, 4);
	}

	@Test
	public void testSubstring2() {
		StringBuilder sb = new StringBuilder("abc");
		sb.substring(1);
		// that does actually not change the StringBuilders value!
		assertThat(sb.toString(), equalTo("abc"));

		String s = sb.substring(1);
		// we need to first set a String object!
		assertThat(s, equalTo("bc"));

		String s2 = sb.substring(1, 2);
		// the rest i the same like substring on String!
		assertThat(s2, equalTo("b"));

		System.out.println("sb" + sb);

		String s3 = sb.substring(1, 1);
		// the rest i the same like substring on String!
		assertThat(s3, equalTo(""));
		System.out.println("sb after substring" + sb);
		// this WILL CAN EXCEPTion
		// String s4 = sb.substring(1, 0);
		// the rest i the same like substring on String!
		// assertThat(s4, equalTo(""));

		StringBuilder sb2 = new StringBuilder("abcdefg");
		sb2.replace(0, 5, "NEW");
		assertThat(sb2.toString(), equalTo("NEWfg"));

		String str = new String("abcdefg");
		str.replace("abc", "zzz");
		// remember, Strings are not mutable, so this will remain the same!
		assertThat(str, equalTo("abcdefg"));

		// we need to set it again!
		str = str.replace("abc", "zzz");
		assertThat(str, equalTo("zzzdefg"));

	}

	@Test
	public void multipleReferences() {
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b.append("f");
		b = b.append("g").append('-').append(true);

		assertThat(a.toString(), equalTo("abcdefg-true"));
		assertThat(b.toString(), equalTo("abcdefg-true"));
		assertThat(a.hashCode(), is(b.hashCode()));
	}

	@Test
	public void testInsert() {
		StringBuilder a = new StringBuilder("abcdefg");
		a.insert(2, "-");

		assertThat(a.toString(), equalTo("ab-cdefg"));
		assertThat(a.toString(), not(equalTo("abc-defg")));

		// this will insert the - BEFORE the char at position 5;
		a = new StringBuilder("012345");
		a.insert(5, "-");
		assertThat(a.toString(), equalTo("01234-5"));

		// this will insert the - at the END;
		a = new StringBuilder("012345");
		a.insert(6, "-");
		assertThat(a.toString(), equalTo("012345-"));

		// will return error, since 7 is out of bounds;
		a = new StringBuilder("012345");
		exception.expect(StringIndexOutOfBoundsException.class);
		a.insert(7, "-");
		assertThat(a.toString(), equalTo("012345-"));

	}

	@Test
	public void testDelete() {
		StringBuilder a = new StringBuilder("abcdefg");
		a.delete(2, 3);

		assertThat(a.toString(), equalTo("abdefg"));

		a = new StringBuilder("abcdefg");
		a.delete(2, 4);

		assertThat(a.toString(), equalTo("abefg"));

		a = new StringBuilder("abcdefg");
		a.deleteCharAt(1);

		assertThat(a.toString(), equalTo("acdefg"));

	}

	@Test
	public void testReverse() {
		StringBuilder a = new StringBuilder("abcdefg");
		a.reverse();

		assertThat(a.toString(), equalTo("gfedcba"));

	}

	@Test
	public void testCharAt() {
		StringBuilder sb = new StringBuilder("abcdefg");
		char a = sb.charAt(1);

		assertThat(a, equalTo('b'));

		String s = new String("abcdefg");
		char b = s.charAt(0);
		assertThat(b, equalTo('a'));
	}

	@Test
	public void testDelete2() {
		StringBuilder a = new StringBuilder("abcdefg");
		a.delete(2, 3);

		assertThat(a.toString(), equalTo("abdefg"));

		a = new StringBuilder("abcdefg");
		a.delete(2, 4);

		assertThat(a.toString(), equalTo("abefg"));

		a = new StringBuilder("abcdefg");
		a.deleteCharAt(1);

		assertThat(a.toString(), equalTo("acdefg"));

		a = new StringBuilder("1234");
		a = a.delete(0, 1);
		assertThat(a.toString(), equalTo("234"));

	}

	@Test
	public void testSetLength() {
		StringBuilder sb = new StringBuilder("abcdefg");

		// sets the length of the StringBuilder and cuts everything else off..
		// note: lengtsh is amount of chars! and not index starting from 0!!
		sb.setLength(2);
		assertThat(sb.toString(), equalTo("ab"));

	}

	@Test
	public void testSubstring3() {
		StringBuilder sb = new StringBuilder();
		sb.append("a");
		sb.append("asdf");
		sb.insert(2, "asdf");
		assertThat(sb.toString(), equalTo("aaasdfsdf"));

		sb = new StringBuilder("superman");
		sb.append("a").insert(2, "asdf").substring(0, 4);
		// watch out! "substring" is not changing the actual StringBuilder
		// Object. It returns String!
		assertThat(sb.toString(), equalTo("suasdfpermana"));

		sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		assertThat(sub, equalTo("anim"));
		
		sb = new StringBuilder("superman");
		 sub = sb.substring(sb.indexOf("u"), sb.indexOf("man"));
		assertThat(sub, equalTo("uper"));
		
		// will throw StringIndexOutOfBoundsException
		// sb = new StringBuilder();
		// sb.append("a").insert(2, "asdf").substring(0, 4);
		
	}
	
	@Test
	public void testSubstringExt3(){
		StringBuilder sb = new StringBuilder("welcome  to the sea");
		String s = sb.toString().trim();
		//trim will NOT remove spaces in between!
		assertThat(s, equalTo("welcome  to the sea"));
		sb = new StringBuilder("welcome");
		s = sb.substring(2,4);
		//REMEMBER, alwys cut BEFORE!
		assertThat(s, equalTo("lc"));
		sb = new StringBuilder("Method");
		s = sb.substring(2,5);
		assertThat(s, equalTo("tho"));
		sb = new StringBuilder("statement");
		s = sb.substring(3,3);
		assertThat(s, equalTo(""));
		sb = new StringBuilder("statement");
		s = sb.substring(1,5);
		assertThat(s, equalTo("tate"));
	}

}
