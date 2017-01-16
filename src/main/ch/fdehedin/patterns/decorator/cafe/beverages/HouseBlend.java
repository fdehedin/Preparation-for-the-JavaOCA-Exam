package ch.fdehedin.patterns.decorator.cafe.beverages;

public class HouseBlend extends Beverage {

	public HouseBlend(Size size) {
		super(size);
		description = String.format("House Blend Coffee (%s)", this.size);
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
