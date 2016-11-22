package ch.fdehedin.oca.Lambdas;

@FunctionalInterface
public interface Runnable {

	public void run();

	
	public static void somethingElse(){
		
	}
	
	public default void somethingDefault(){
		
	}
	
}
