package ch.fdehedin.patterns.factory.simple.pizza;

public class PizzaStore {
	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public Pizza orderPizza(Pizza.PizzaType type) {
		Pizza pizza;

		pizza = factory.createPizza(type);

		return pizza;
	}

}
