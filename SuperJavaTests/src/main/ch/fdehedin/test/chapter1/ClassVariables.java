//comment for package
package ch.fdehedin.test.chapter1;

import org.junit.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassVariables {
 
	private static final Logger logger = LoggerFactory.getLogger(ClassVariables.class);

	
	static boolean b;
	static byte b1;
	static short s;
	static int i;
	static long l;
	static char c;
	static Object o;
	
	public static void main(String[] args) {
	
		logger.debug("boolean: "+b);
		logger.debug("byte: "+b1);
		logger.debug("short: "+s);
		logger.debug("int: "+i);
		logger.debug("long: "+l);
		logger.debug("char: "+c);
		logger.debug("Object: "+o);
		}
	
}
