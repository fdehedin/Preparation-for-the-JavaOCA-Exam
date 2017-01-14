package ch.fdehedin.patterns.decorator.cafe.condiments;

import ch.fdehedin.patterns.decorator.cafe.beverages.Beverage;

//Condiemt = Zutat..
public abstract class CondimentDecorator extends Beverage {

	@Override
	public abstract String getDescription();

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
