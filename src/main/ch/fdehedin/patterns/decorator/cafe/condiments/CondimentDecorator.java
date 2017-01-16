package ch.fdehedin.patterns.decorator.cafe.condiments;

import ch.fdehedin.patterns.decorator.cafe.beverages.Beverage;

//Condiemt = Zutat..
public abstract class CondimentDecorator extends Beverage {

	Beverage beverage;

	public CondimentDecorator(Beverage beverage) {
		super(null);
		this.beverage = beverage;
	}

	@Override
	public abstract String getDescription();

	public Size getSize() {
		return this.beverage.getSize();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
