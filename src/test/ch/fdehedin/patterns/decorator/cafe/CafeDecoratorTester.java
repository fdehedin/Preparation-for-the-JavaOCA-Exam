package ch.fdehedin.patterns.decorator.cafe;

import java.util.logging.Logger;

import org.junit.Test;

import ch.fdehedin.patterns.decorator.cafe.beverages.Beverage;
import ch.fdehedin.patterns.decorator.cafe.beverages.DarkRoast;
import ch.fdehedin.patterns.decorator.cafe.beverages.Espresso;
import ch.fdehedin.patterns.decorator.cafe.beverages.HouseBlend;
import ch.fdehedin.patterns.decorator.cafe.beverages.Lavazza;
import ch.fdehedin.patterns.decorator.cafe.condiments.Mocha;
import ch.fdehedin.patterns.decorator.cafe.condiments.Soy;
import ch.fdehedin.patterns.decorator.cafe.condiments.Whip;
import ch.fdehedin.patterns.javaobserver.weather.impl.CurrentConditionsDisplay;

public class CafeDecoratorTester {

	private static final Logger LOGGER = Logger.getLogger(CafeDecoratorTester.class.getSimpleName());

	@Test
	public void orderCafe() {
		Beverage beverage = new Espresso();
		LOGGER.info(beverage.getDescription() + " CHF " + beverage.cost());

		Beverage beverage2 = new Lavazza();
		beverage2 = new Soy(beverage2);
		LOGGER.info(beverage2.getDescription() + " CHF " + beverage2.cost());

		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		beverage3 = new Whip(beverage3);
		LOGGER.info(beverage3.getDescription() + " CHF " + beverage3.cost());

	}

}
