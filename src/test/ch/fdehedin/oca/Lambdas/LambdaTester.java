package ch.fdehedin.oca.Lambdas;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LambdaTester {

	public static int totalAmount = 0;

	@Test
	public void testLambda() {
		SizeTester testerMin = i -> (i > SizeTester.MIN_SIZE & i < SizeTester.MAX_SIZE);
		assertThat(testerMin.sizeEnough(123), is(true));
		assertThat(testerMin.sizeEnough(99), is(false));
		assertThat(testerMin.sizeEnough(201), is(false));
		assertThat(testerMin.sizeEnough(120), is(true));

		Ingetter ingetter = () -> System.out.println("just got in");
		ingetter.getIn();

		Payer payer = (String curr, double amount) -> this.totalAmount += amount;
		payer.pay("CHF", 200);
		payer.pay("CHF", 200);
		
		assertThat(this.totalAmount == 400, is(true));
	}
}

@FunctionalInterface
interface SizeTester {
	public static final int MIN_SIZE = 100;
	public static final int MAX_SIZE = 200;

	public boolean sizeEnough(int cm);
}

@FunctionalInterface
interface Ingetter {
	public void getIn();
}

@FunctionalInterface
interface Payer {
	public void pay(String curr, double amount);
}