package ch.fdehedin.patterns.decorator.cafe.beverages;

public abstract class Beverage {

	public enum Size {
		SMALL, MEDIUM, LARGE
	};

	protected final Size size;

	protected String description = "Unknown";
	
	public Beverage(Size size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public Size getSize() {
		return size;
	}

	public abstract double cost();
}
