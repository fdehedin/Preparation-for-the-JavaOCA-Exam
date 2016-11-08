package ch.fdehedin.oca.MethodsAndEncapsulation;

public class Order {

	private static final String test;
	
	static String result = "";
	{
		System.out.println("adding c");
		result += "c";
		System.out.println("adding c: after: so result is now: "+ result);
	}
	
	
	static {
		test = "te";
		System.out.println("adding u");
		result += "u";
		System.out.println("adding u: after: so result is now: "+ result);
	}
	{
		System.out.println("adding r");
		result += "r";
		System.out.println("adding r: after: so result is now: "+ result);
	}
	
	static void test(){
		
	}
}
