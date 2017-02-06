package ch.fdehedin.patterns.factory.simple.pizza;

import java.util.List;
import java.util.logging.Logger;

import ch.fdehedin.patterns.factory.simple.invoicing.CustomerMonthlyInvoice;

public interface Pizza {

	public enum PizzaType {
		CHEESE, PEPPERONI, CLAM
	}

	public void box();

	public void cut();

	public void baking();

	public void prepare();

	public List<String> getTopping();

	public void addTopping(String topping);

	public void setTopping(List<String> toppings);

}
