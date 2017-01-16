package ch.fdehedin.patterns.decorator.cafe.beverages;

public class DarkRoast extends Beverage {

	public DarkRoast(Size size) {
		super(size);
		description = String.format("Dark Roast (%s)", this.size);
	}

	@Override
	public double cost() {
		return 1.69;
	}

}
