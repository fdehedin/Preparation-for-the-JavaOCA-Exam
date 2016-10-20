package ch.fdehedin.oca.OperatorsAndStatements;

import org.junit.Test;

public class ReviewQuestions {

	public void casting() {
		byte x = 5;
		byte y = 10;

		int z = x + y;
		long n = x + y;
		// boolean z = x+y;
		double dbl = x + y;
		
		int s=0;
		if(s ==dbl){
			//yep, that works....
		}
		// short s = x+y; does not worh! since the calculation results in a
		// "int" type, so bigger than "short".. and we can not automaticly cast
		// into a smaller type!
		// byte b = x+y;does not worh! since the calculation results in a
		// "int" type, so bigger than "byte".. and we can not automaticly cast
		// into a smaller type!
	}

	@Test
	public void looper() {
		for (int i = 0; i < 10;) {
			// the following will result into an infinite loop! i++ would be
			// correct, but i = i++ is setting i to 0 again, since i++ is
			// incremented by 1 AFTER the call..

			// i = i++;
			i++;
			System.out.println("i=" + i);
		}
		
		
	}

	public void byter() {
		int a = 40, b = 50;
		// byte sum = ((byte) a)+b;
		// does not compile, since a is converted to byte, but the calculation
		// is converted to int again, and thus cannot be casted directly to
		// int..
	}

}
