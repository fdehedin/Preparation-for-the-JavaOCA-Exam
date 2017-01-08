package ch.fdehedin.oca.ClassDesign.polymorphism.book;

import java.util.logging.Logger;

public class Lemur extends Primate implements HasTail {
	private static final Logger LOG = Logger.getLogger(Lemur.class.getSimpleName());

	public int age = 10;

	@Override
	public boolean isTailStriped() {
		return false;
	}

	private boolean hasHair2 = false;

	public boolean hasHair() {
		return this.hasHair2;
	}

	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		LOG.info("Lemur age: " + lemur.age);

		HasTail hasTail = lemur;
		// LOG.info("HasTail age: "+hasTail.age);
		LOG.info("HasTail isTailStriped: " + hasTail.isTailStriped());

		Primate primate = lemur;
		LOG.info("Primate hasHair: " + primate.hasHair());
		
		Primate realPrimate = (Primate)lemur;
		LOG.info("Real Primate hasHair: " + realPrimate.hasHair());
		
		//this will produce a class cast exception!
		Primate onlyPrimate = new Primate();
		lemur = (Lemur)onlyPrimate;
	}

}
