package ch.fdehedin.test.patterns.abstractfactory;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("i^am a rectangle and now im drawing");
	}

}
