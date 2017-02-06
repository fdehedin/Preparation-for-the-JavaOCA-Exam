package ch.fdehedin.patterns.factory.simple.pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import ch.fdehedin.patterns.factory.simple.invoicing.CustomerMonthlyInvoice;

public class PizzaImpl implements Pizza {

	private static final Logger LOGGER = Logger.getLogger(PizzaImpl.class.getSimpleName());

	private PizzaType type;

	private List<String> toppings = new ArrayList<>();

	public PizzaImpl(Pizza.PizzaType type) {
		this.type = type;
	}

	public List<String> getTopping() {
		return toppings;
	}

	public void box() {
		LOGGER.info(String.format("boxing %s pizza", this.type));
	}

	public void cut() {
		LOGGER.info(String.format("cutting %s pizza", this.type));
	}

	public void baking() {
		LOGGER.info(String.format("baking %s pizza", this.type));
	}

	public void prepare() {
		LOGGER.info(String.format("preparing %s pizza", this.type));
	}

	public void addTopping(String topping) {
		LOGGER.info(String.format("adding topping %s to %s pizza", topping, this.type));
		this.toppings.add(topping);
	}

	public void setTopping(List<String> toppings) {
		this.toppings = toppings;
	}

}
