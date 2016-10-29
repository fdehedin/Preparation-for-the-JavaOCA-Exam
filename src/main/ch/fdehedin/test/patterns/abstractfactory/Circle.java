package ch.fdehedin.test.patterns.abstractfactory;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("i^am a circle and now im drawing");
	}

}
