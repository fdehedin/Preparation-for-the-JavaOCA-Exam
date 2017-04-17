package ch.fdehedin.patterns.factory.pizza;

import java.util.List;
import java.util.logging.Logger;

import ch.fdehedin.patterns.factory.pizza.ingredients.*;

public abstract class Pizza {
	private static final Logger LOGGER = Logger.getLogger(Pizza.class.getSimpleName());

	public enum PizzaType {
		CHEESE, CLAM;
	}

	protected String name;

	protected Dough dough;
	protected Sauce sauce;
	protected List<Vegetable> vegetables;
	protected Cheese cheese;
	protected Clam clam;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dough getDough() {
		return dough;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public List<Vegetable> getVegetables() {
		return vegetables;
	}

	public void setVegetables(List<Vegetable> vegetables) {
		this.vegetables = vegetables;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	public Clam getClam() {
		return clam;
	}

	public void setClam(Clam clam) {
		this.clam = clam;
	}

	public void box() {
		LOGGER.info(String.format("boxing %s pizza in official box", this.name));
	}

	public void cut() {
		LOGGER.info(String.format("cutting %s pizza in diagonal slices", this.name));
	}

	public void bake() {
		LOGGER.info(String.format("baking %s pizza 10minutes at 350°", this.name));
	}

	public abstract void prepare();
}
