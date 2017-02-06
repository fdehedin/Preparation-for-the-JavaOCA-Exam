package ch.fdehedin.patterns.factory.simple.pizza;

import org.junit.Test;

import ch.fdehedin.patterns.factory.simple.pizza.Pizza.PizzaType;

public class PizzaFactoryTest {

	@Test
	public void testPizzaFactorySimple() {

		PizzaStore store = new PizzaStore(new SimplePizzaFactory());

		store.orderPizza(PizzaType.CHEESE);

		store.orderPizza(PizzaType.PEPPERONI);

		store.orderPizza(PizzaType.CLAM);

	}

}
