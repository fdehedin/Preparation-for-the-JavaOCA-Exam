package ch.fdehedin.patterns.factory.pizza;

import java.util.NoSuchElementException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import ch.fdehedin.patterns.factory.pizza.Pizza.PizzaType;

public class PizzaFactoryTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void testPizzaFactory() {

		PizzaStore storeNY = new NYPizzaStore();
		storeNY.orderPizza(PizzaType.CHEESE);
		// storeNY.orderPizza(PizzaType.PEPPERONI);
		storeNY.orderPizza(PizzaType.CLAM);

		PizzaStore storeSwiss = new SwissPizzaStore();
		storeSwiss.orderPizza(PizzaType.CHEESE);
		// storeSwiss.orderPizza(PizzaType.PEPPERONI);

		exception.expect(NoSuchElementException.class);
		storeSwiss.orderPizza(PizzaType.CLAM);

	}

}
