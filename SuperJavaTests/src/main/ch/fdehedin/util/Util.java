package ch.fdehedin.util;

public class Util {
	/**
	 * Gets the type of a given object. Primitive types will be autoboxed..
	 * 
	 * @param o
	 * @return type name of the given object
	 */
	public static String getType(Object o) {
		return o.getClass().getName();
	}
}
