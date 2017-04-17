package ch.fdehedin.patterns.factory.pizza.ingredients.impl;

import java.util.ArrayList;
import java.util.List;

import ch.fdehedin.patterns.factory.pizza.ingredients.Cheese;
import ch.fdehedin.patterns.factory.pizza.ingredients.Clam;
import ch.fdehedin.patterns.factory.pizza.ingredients.Dough;
import ch.fdehedin.patterns.factory.pizza.ingredients.PizzaIngredientFactory;
import ch.fdehedin.patterns.factory.pizza.ingredients.Sauce;
import ch.fdehedin.patterns.factory.pizza.ingredients.Vegetable;

public class SwissPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new AppenzellerCheese();
	}

	@Override
	public List<Vegetable> createVegetables() {
		List<Vegetable> result = new ArrayList<>();
		result.add(new Garlic());
		result.add(new Olive());
		result.add(new Pepperoni());
		result.add(new Onion());
		return result;
	}

	@Override
	public Clam createClam() {
		return null;
	}

}
