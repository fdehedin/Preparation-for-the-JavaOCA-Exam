package ch.fdehedin.oca.MethodsAndEncapsulation;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.logging.Logger;

public class MethodOverloader {

	private static final Logger log = Logger.getLogger(MethodOverloader.class.getSimpleName());


	{System.out.println("instance init");}	
	static
	{System.out.println("static init");}
	
	
	public void fly(int meters) {
	//	int y = meters* (long)meters;
		log.info("int");
		MethodOverloader.fly((short)28);
		new MethodOverloader();
	
	}

	// totally fine..
	public void fly(long meters) {
		log.info("long");
	}

	// this is fine too!
	public static void fly(short meters) {
log.info("short");
	}
	
	public static void fly(float meters) {
log.info("float");
	}


	
	// we can't have 2 methods with same signature and one is static and the
	// other is instance.. DOES NOT COMPILE!
	// public void fly(double meters) {
	//
	// }
	// public static void fly(double meters) {
	//
	// }


	
	@Test
	public void testJump() {
		this.fly(2);
		//this.fly(2.3);
		this.jump(10);
		this.jump(20, 30);
		this.jump(new int[] { 20, 30 });
	}

	public void jump(int meters) {
		log.info("i jump: " + meters);
	}

	public void jump(int... meters) {
		log.info("i jump: " + Arrays.toString(meters));
	}

	// DOES NOT COMPILE, because int... param and int[] is literally the same!
	// public void jump(int[] meters){
	// }
}
