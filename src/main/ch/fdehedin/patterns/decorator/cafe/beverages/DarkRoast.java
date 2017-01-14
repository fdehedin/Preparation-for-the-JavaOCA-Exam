package ch.fdehedin.patterns.decorator.cafe.beverages;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast";
	}

	@Override
	public double cost() {
		return 1.69;
	}

}
