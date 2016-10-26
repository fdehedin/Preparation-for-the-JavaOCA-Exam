package ch.fdehedin.oca.buildingblocks;

public class GarbageCollectionTester {

	
	
	public static void main(String[] args) {
	
		
		String one, two;
		one = new String("a");
		two = new String("b");
		one = two;
		String three = one;
		one = null;

		System.out.println("one: " + one + ", two: " + two + ", three: " + three);
		
		//Test from the book:
		final class Rabbit{
			private String name;
			public Rabbit(String name){
				this.name=name;
			}
			public String toString(){
				return " Rabbit: "+this.name;
			}
			@Override
			protected void finalize() throws Throwable {
				try {
					System.out.println("finalize in Rabit: "+name);
				} finally {
					super.finalize();
				}
			}
		}
		
		Rabbit oneR = new Rabbit("one");
		Rabbit twoR = new Rabbit("two");
		Rabbit threeR = oneR;
		
		oneR = null;
		Rabbit fourR = oneR;
		//from this point, oneR is not used anymore, so it is eligle for GC
		threeR = null;
		twoR = null;
		twoR = new Rabbit ("new two");
		//twoR is now eligle for GC, because there are no more references in this scope / block
		System.gc();
				
		GarbageCollectionTester gct = new GarbageCollectionTester();
		gct = null;
		System.gc();
		System.gc();
	}

	/*
	 * finalize test.. remember: that might NOT get called, and also it will
	 * definitely NOT called twice..
	 * 
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		try {
			System.out.println("finalize..");
		} finally {
			super.finalize();
		}
	}
}
