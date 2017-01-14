package ch.fdehedin.patterns.decorator.cafe.condiments;

import ch.fdehedin.patterns.decorator.cafe.beverages.Beverage;

public class Soy extends CondimentDecorator {

	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + .55;
	}

}
