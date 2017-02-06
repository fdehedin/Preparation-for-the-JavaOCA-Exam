package ch.fdehedin.patterns.strategie.duck;

import java.util.logging.Logger;

public abstract class Duck {

	private static final Logger LOGGER = Logger.getLogger(Duck.class.getSimpleName());

	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;

	public abstract void display();

	public void swim() {
		LOGGER.info("i am swimming! (all ducks can swim, even decoys..");
	}

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public QuackBehaviour getQuackBehaviour() {
		return quackBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	
	
}
