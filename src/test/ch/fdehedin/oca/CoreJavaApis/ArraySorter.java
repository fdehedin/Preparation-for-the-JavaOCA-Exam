package ch.fdehedin.oca.CoreJavaApis;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import org.hamcrest.collection.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ArraySorter {
	private static final Logger log = Logger.getLogger(WrapperAndAutoboxer.class.getSimpleName());

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void sort() {
		List<String> list = new ArrayList<>();
		list.add("robin");
		list.add("batman");

		Collections.sort(list);
		assertThat(list, contains("batman", "robin"));

	}

}
