package ch.fdehedin.test.chapter1;

import java.text.NumberFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimitiveTypeTester {
	private static final Logger logger = LoggerFactory.getLogger(PrimitiveTypeTester.class);

	public static void main(String[] args) {
		logger.debug("Boolean Type value: " + Boolean.TYPE);
		logger.debug("Integer MAX value: " + NumberFormat.getIntegerInstance().format(Integer.MAX_VALUE));
		logger.debug("Integer MAX value: " + NumberFormat.getIntegerInstance().format(Integer.MAX_VALUE));
		logger.debug("Short MAX value: " + NumberFormat.getIntegerInstance().format(Short.MAX_VALUE));
		logger.debug("Long MAX value: " + NumberFormat.getIntegerInstance().format(Long.MAX_VALUE));
		logger.debug("Byte MAX value: " + NumberFormat.getIntegerInstance().format(Byte.MAX_VALUE));
		logger.debug("Float MAX Value: " + NumberFormat.getIntegerInstance().format(Float.MAX_VALUE));
		logger.debug("Double MAX Value: " + NumberFormat.getIntegerInstance().format(Double.MAX_VALUE));

		// the additional L is needed so java knows that the
		// number literal is a Long value..
		Long l = 787878L;

		// the additional F is needed so java knows that the
		// number literal is a Float value..
		Float f = 787878F;

		// java 7 introduced the underscore option for thousand separators to
		// literals, so values are easier to read..
		Double dbl = 10_000_000.0;

		// anyway, they must sit between digits!
		// double dblWrong = 10_.0;

		// primitive types cannot be null-ed"
		// int i = null;

		// String can..String is not a primitive type anyway..
		String s = null;

		String reference = "hello";
		int len = reference.length();
		// int superlen = len.length(); DOES NOT COMPILE, primitives have no
		// methods..

		// this does compile, since we can use the autoboxing for accessing
		// methods..
		System.out.println("int compare to:" + Integer.valueOf(len).compareTo(10_000));

		// We can declare and assign values to multiple variables using a one
		// liner.. but is not very readable, isn't it?
		String s1, s2, b = "hello", c = "world";

		// however, you can't use different types in 1 line..
		// String str,int i; DOES NOT COMPILE
		// double dbl1, double dbl2 DOES NOT COMPILE

		int y = 10;
		int x;
		//int numgrains = 2.5; DOES NOT COMPILE (DOUBLE)
		// int reply = y+x; DOES NOT COMPILE

		// identifiers can have any alphanumerical letters, baut cannot start
		// with numerical, but can contain $ or _ anyhwere and many of
		// them..anyway, who needs the _ and $ in variable names?..
		String dollar$, $dollar, _super, bla_bla_bla, _______tet;
		// String 45test;DOES NOT COMPILE
		// String &test;DOES NOT COMPILE

		//initialization test
		int e = 10;
		int w;
		w = 3;//if not initialized, it wll not compile..
		int reply = e + w;
		
		//branch test
		int answer;
		int onlyOneBranch;
		boolean t = true;
		if(t){
			answer = 1;
		}
	//	System.out.println("answer: "+answer);//DOES NOT COMPILE
	}

}
