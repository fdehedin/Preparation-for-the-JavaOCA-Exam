package ch.fdehedin.patterns.factory.simple.pizza;

public class SimplePizzaFactory {

	public Pizza createPizza(Pizza.PizzaType type) {
		Pizza pizza = new PizzaImpl(type);

		switch (type) {
		case CHEESE:
			pizza.addTopping("Cheese");
			break;
		case CLAM:
			pizza.addTopping("clam clam clam");
			break;
		case PEPPERONI:
			pizza.addTopping("red pepperoni");
			pizza.addTopping("green pepperoni");
			break;
		default:
			break;
		}
		
		pizza.prepare();
		pizza.baking();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
