package ch.fdehedin.patterns.decorator.cafe.beverages;

public class Lavazza extends Beverage {

	public Lavazza(Size size) {
		super(size);
		description = String.format("Lavazza Special (%s)", this.size);
	}

	@Override
	public double cost() {
		return 2.69;
	}

}
