package ch.fdehedin.patterns.decorator.cafe.condiments;

import ch.fdehedin.patterns.decorator.cafe.beverages.Beverage;

public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		super(beverage);

	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {

		double result = 0.0;

		switch (beverage.getSize()) {
		case LARGE:
			result = beverage.cost() + .13;
		case MEDIUM:
			result = beverage.cost() + .7;
		case SMALL:
			result = beverage.cost() + .5;
		}

		return result;

	}

}
