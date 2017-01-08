package ch.fdehedin.oca.Lambdas;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;

import org.junit.Test;

public class LambdaWithPredicateTester {
	private static final Logger log = Logger.getLogger(LambdaWithPredicateTester.class.getSimpleName());

	@Test
	public void predicate() {
		Predicate<String> emptyStringCheck = s -> s.isEmpty();
		assertThat(emptyStringCheck.test("test"), is(false));
		assertThat(emptyStringCheck.test(""), is(true));

		Predicate<Object> isArray = (Object o) -> {
			return o.getClass().isArray();
		};
		assertThat(isArray.test("test"), is(false));
		assertThat(isArray.test(new int[2]), is(true));

		Box[] inventory = { new Box(2, "green"), new Box(1, "red"), new Box(3, "blue") };

		List<Box> lstBiggerThan1 = filterByBox(Arrays.asList(inventory), (Box b) -> b.getWeight() > 1);
		assertThat(lstBiggerThan1.size(), is(2));
	}

	public List<Box> filterByBox(List<Box> list, Predicate<Box> predicate) {
		List<Box> result = new ArrayList<>();

		for (Box box : list) {
			if (predicate.test(box)) {
				result.add(box);
			}
		}

		return result;
	}

}

class Box {
	private int weight = 0;
	private String color = "";

	public Box(int weight, String color) {
		this.weight = weight;
		this.color = color;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Apple{" + "color='" + color + '\'' + ", weight=" + weight + '}';
	}
}