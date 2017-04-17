package ch.fdehedin.patterns.factory.pizza;

import ch.fdehedin.patterns.factory.pizza.Pizza.PizzaType;
import ch.fdehedin.patterns.factory.pizza.ingredients.PizzaIngredientFactory;
import ch.fdehedin.patterns.factory.pizza.ingredients.impl.NYPizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(Pizza.PizzaType type) {

		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		switch (type) {
		case CHEESE:
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Cheese Pizza NY Style");
			break;
		case CLAM:
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Clam Pizza with fresh NY Clams");
			break;
		default:
			break;
		}
		return pizza;
	}
}
