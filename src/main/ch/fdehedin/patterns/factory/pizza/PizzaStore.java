package ch.fdehedin.patterns.factory.pizza;

public abstract class PizzaStore {
	// SimplePizzaFactory factory;

	// public PizzaStore(SimplePizzaFactory factory) {
	// this.factory = factory;
	// }

	public Pizza orderPizza(Pizza.PizzaType type) {
		Pizza pizza;

		// pizza = factory.createPizza(type);
		pizza = createPizza(type);

		pizza.prepare();

		pizza.bake();

		pizza.cut();

		pizza.box();

		return pizza;
	}

	public abstract Pizza createPizza(Pizza.PizzaType type);
}
