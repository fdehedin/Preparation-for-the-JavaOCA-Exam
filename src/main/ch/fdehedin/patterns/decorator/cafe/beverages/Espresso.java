package ch.fdehedin.patterns.decorator.cafe.beverages;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Expresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
