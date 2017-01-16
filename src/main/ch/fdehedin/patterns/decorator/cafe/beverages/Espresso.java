package ch.fdehedin.patterns.decorator.cafe.beverages;

public class Espresso extends Beverage {

	public Espresso(Size size) {
		super(size);
		description = String.format("Expresso (%s)", this.size);
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
