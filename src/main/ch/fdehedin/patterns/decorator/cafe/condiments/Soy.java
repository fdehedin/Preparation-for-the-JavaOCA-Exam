package ch.fdehedin.patterns.decorator.cafe.condiments;

import ch.fdehedin.patterns.decorator.cafe.beverages.Beverage;

public class Soy extends CondimentDecorator {

	
	public Soy(Beverage beverage) {
		super(beverage);
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {

		double result = 0.0;

		switch (beverage.getSize()) {
		case LARGE:
			result = beverage.cost() + .65;
		case MEDIUM:
			result = beverage.cost() + .55;
		case SMALL:
			result = beverage.cost() + .35;
		}

		return result;

	}

}
