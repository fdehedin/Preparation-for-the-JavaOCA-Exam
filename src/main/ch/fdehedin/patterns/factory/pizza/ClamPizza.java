package ch.fdehedin.patterns.factory.pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import ch.fdehedin.patterns.factory.pizza.ingredients.PizzaIngredientFactory;
import ch.fdehedin.patterns.factory.simple.invoicing.CustomerMonthlyInvoice;

public class ClamPizza extends Pizza {

	private static final Logger LOGGER = Logger.getLogger(ClamPizza.class.getSimpleName());

	PizzaIngredientFactory ingredientFactory;

	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		LOGGER.info("prepare pizza: " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}

}
