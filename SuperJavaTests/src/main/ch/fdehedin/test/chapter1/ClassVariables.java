//comment for package
package ch.fdehedin.test.chapter1;

import org.junit.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassVariables {

	private static final Logger logger = LoggerFactory.getLogger(ClassVariables.class);

	static String name; // null
	static boolean b;// false
	static byte b1;// 0
	static short s;// 0
	static int i;// 0
	static long l;// 0
	static char c;// \u0000
	static Object o;// null
	static Integer in;// null

	public static void main(String[] args) {
		logger.debug("String: " + name);
		logger.debug("boolean: " + b);
		logger.debug("byte: " + b1);
		logger.debug("short: " + s);
		logger.debug("int: " + i);
		logger.debug("long: " + l);
		logger.debug("char: " + c);
		logger.debug("Object: " + o);
		logger.debug("Integer: " + in);
	}

	public static void testLocalVariables() {
		String name;
		boolean b;
		byte b1;
		short s;
		int i;
		long l;
		char c;
		Object o;
		Integer in;

		/*
		 * 
		 * the following code will not compile, since local variables need to be
		 * initialized
		 *
		 * 
		 * logger.debug("String: " + name); logger.debug("boolean: " + b);
		 * logger.debug("byte: " + b1); logger.debug("short: " + s);
		 * logger.debug("int: " + i); logger.debug("long: " + l);
		 * logger.debug("char: " + c); logger.debug("Object: " + o);
		 * logger.debug("Integer: " + in);
		 */
	}

}
