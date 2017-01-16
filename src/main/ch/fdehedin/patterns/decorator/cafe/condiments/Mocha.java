package ch.fdehedin.patterns.decorator.cafe.condiments;

import ch.fdehedin.patterns.decorator.cafe.beverages.Beverage;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {

		double result = 0.0;

		switch (beverage.getSize()) {
		case LARGE:
			result = beverage.cost() + .24;
		case MEDIUM:
			result = beverage.cost() + .20;
		case SMALL:
			result = beverage.cost() + .18;
		}

		return result;

	}

}
