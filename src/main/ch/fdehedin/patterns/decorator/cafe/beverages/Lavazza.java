package ch.fdehedin.patterns.decorator.cafe.beverages;

public class Lavazza extends Beverage {

	public Lavazza() {
		description = "Lavazza Special";
	}

	@Override
	public double cost() {
		return 2.69;
	}

}
