package ch.fdehedin.patterns.factory.pizza;

import java.util.NoSuchElementException;

import ch.fdehedin.patterns.factory.pizza.ingredients.PizzaIngredientFactory;
import ch.fdehedin.patterns.factory.pizza.ingredients.impl.SwissPizzaIngredientFactory;

public class SwissPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(Pizza.PizzaType type) {

		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new SwissPizzaIngredientFactory();

		switch (type) {
		case CHEESE:
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Cheese Pizza Swiss Style");
			break;
		case CLAM:
			throw new NoSuchElementException("Swiss do not eat clam pizza!");
		default:
			break;
		}
		return pizza;
	}
}
