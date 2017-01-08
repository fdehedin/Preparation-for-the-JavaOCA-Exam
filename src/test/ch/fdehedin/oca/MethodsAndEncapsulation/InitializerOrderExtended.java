package ch.fdehedin.oca.MethodsAndEncapsulation;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;

import ch.fdehedin.util.TestUtil;

public class InitializerOrderExtended {
	private static final Logger log = Logger.getLogger(InitializerOrderExtended.class.getSimpleName());

	public static final List<String> ORDER = new ArrayList<>();

	static {
		ORDER.add("static class init");
	}

	static {
		ORDER.add("another static class init");
		//throw new Exception("");
	}

	{
		ORDER.add("instance init");
	}

	public InitializerOrderExtended() {
		ORDER.add("constructor");
	}

	public static void main(String[] args) {
		ORDER.add("Main function");
		InitializerOrderExtended ioe = new InitializerOrderExtended();
		log.info("order:" + ioe.ORDER);
		Collection<String> expectedOrder = new ArrayList<String>();
		expectedOrder.add("static class init");
		expectedOrder.add("another static class init");
		expectedOrder.add("Main function");
		expectedOrder.add("instance init");
		expectedOrder.add("constructor");

		log.info("result:" + expectedOrder.equals(ioe.ORDER));

		// assertThat(InitializerOrderSimple.ORDER_STATICONLY,
		// TestUtil.containsInOrder(expectedOrder));

	}
}
