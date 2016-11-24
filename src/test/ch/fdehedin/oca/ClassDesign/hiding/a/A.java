package ch.fdehedin.oca.ClassDesign.hiding.a;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class A {

<<<<<<< HEAD
	public int i = 10;
	
=======
	// cannot be protected when using in antoher package!!
	// A() {
>>>>>>> branch 'master' of https://github.com/fdehedin/Preparation-for-the-JavaOCA-Exam.git
	public A() {

	}

<<<<<<< HEAD
	public int getInt(){
		return i;
	}
	
=======
	public int getInt() {
		return 1;
	};

>>>>>>> branch 'master' of https://github.com/fdehedin/Preparation-for-the-JavaOCA-Exam.git
}
