package ch.fdehedin.test;

 class MultiClass {

	public static void main(final String[] args) {
		System.out.println(MultiClass.class.getName());
	}
}

class SecondClass {
	public static void main(final String[] args) {
		System.out.println(MultiClass.class.getName());
	}
}