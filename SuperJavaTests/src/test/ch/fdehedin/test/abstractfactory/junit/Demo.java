package ch.fdehedin.test.abstractfactory.junit;

import org.junit.Test;

import ch.fdehedin.test.patterns.abstractfactory.AbstractFactory;
import ch.fdehedin.test.patterns.abstractfactory.FactoryProducer;
import ch.fdehedin.test.patterns.abstractfactory.Shape;

public class Demo {
	
	@Test
	public  void drawShape() {

		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		System.out.println("aaaight, testin time...");
		
		
		// call draw method of Shape Circle
		shape1.draw();

	}
}
