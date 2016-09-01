package ch.fdehedin.test.chapter1;

public  class MultiClass {

	public static void main(final String[] args) {
		System.out.println(MultiClass.class.getName());
	}
	
	static class InnerClass {
		public static void main(final String[] args) {
			System.out.println(InnerClass.class.getName());
		}
	}	
	
}

 class SecondClass {
	public static void main(final String[] args) {
		System.out.println(SecondClass.class.getName());
	}
}