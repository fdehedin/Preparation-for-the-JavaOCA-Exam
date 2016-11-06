package ch.fdehedin.oca.Lambdas.animals;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.logging.Logger;

public class Animal {

	private static final Logger log = Logger.getLogger(Animal.class.getSimpleName());

	private String species;
	private boolean canHop;
	private boolean canSwim;

	public Animal(String species, boolean canHop, boolean canSwim) {
		super();
		this.species = species;
		this.canHop = canHop;
		this.canSwim = canSwim;
	}

	public String getSpecies() {
		return species;
	}

	public boolean isCanHop() {
		return canHop;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	@Override
	public String toString() {
		return "Animal [species=" + species + ", canHop=" + canHop + ", canSwim=" + canSwim + "]";
	}

}
