package ch.fdehedin.patterns.strategie.duck;

import org.junit.Test;

public class DuckTester {

	@Test
	public void testQuackAndFlyOnNormalDucks() {
		showWhatYouCan(new DuckMallard());
		showWhatYouCan(new DuckRubber());
	}

	@Test
	public void testQuackAndFlyOnWoodenDuck() {
		Duck woodenDuck = new DuckWood();
		showWhatYouCan(woodenDuck);
		//now give that duck some wings..
		woodenDuck.setFlyBehaviour(new FlyWithWings());
		showWhatYouCan(woodenDuck);
	}

	private void showWhatYouCan(Duck duck) {
		duck.display();
		duck.performQuack();
		duck.performFly();
	}
}
