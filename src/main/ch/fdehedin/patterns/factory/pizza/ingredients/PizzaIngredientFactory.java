package ch.fdehedin.patterns.factory.pizza.ingredients;

import java.util.List;

public interface PizzaIngredientFactory {

	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public List<Vegetable> createVegetables();

	public Clam createClam();
}
