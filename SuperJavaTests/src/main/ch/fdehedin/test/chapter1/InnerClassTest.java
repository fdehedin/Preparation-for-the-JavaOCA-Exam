package ch.fdehedin.test.chapter1;

import java.util.Iterator;

public class InnerClassTest {

	int num;

	// inner class
	public class Inner_Demo extends AnonymousInner{
		public void print() {
			System.out.println("This is an inner class");
		}

		@Override
		public void mymethod() {
			// TODO Auto-generated method stub
			
		}
	}

	// Accessing he inner class from the method within
	void display_Inner() {
		Inner_Demo inner = new Inner_Demo();
		inner.print();
	}

	public void showDemo() {
		Inner_Demo demo = new Inner_Demo();
		demo.print();
	}

	public static void main(final String[] args) {
		InnerClassTest test = new InnerClassTest();
		test.showDemo();

		AnonymousInner inner = new AnonymousInner() {

			@Override
			public void mymethod() {
				System.out.println("This is an example of anonymous inner class");
			}
		};
		inner.mymethod();
	}
	
	public Iterator<Integer> createIntegerIterator( final int from, final int to)
	{
	    return new Iterator<Integer>(){
	        int index = from;
	        @Override
			public Integer next()
	        {
	            return index++;
	        }
	        @Override
			public boolean hasNext()
	        {
	            return index <= to;
	        }
	        // remove method omitted
	    };
	}
} 

abstract class AnonymousInner {
	public abstract void mymethod();
}