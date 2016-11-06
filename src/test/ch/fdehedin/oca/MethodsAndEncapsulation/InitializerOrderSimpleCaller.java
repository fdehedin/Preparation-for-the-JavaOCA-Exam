package ch.fdehedin.oca.MethodsAndEncapsulation;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

import org.junit.Test;

import ch.fdehedin.util.TestUtil;

public class InitializerOrderSimpleCaller {

	private static final Logger log = Logger.getLogger(InitializerOrderSimpleCaller.class.getSimpleName());

	@Test
	public void testInitializationORder() {
		InitializerOrderSimple ios = new InitializerOrderSimple();
		Collection<String> expectedOrder = new ArrayList<String>();
		expectedOrder.add("static class init");
		expectedOrder.add("another static class init");
		expectedOrder.add("class init");
		expectedOrder.add("constructor");
		log.info("order:" + ios.ORDER);
		assertThat(ios.ORDER, TestUtil.containsInOrder(expectedOrder));
	}

	@Test
	public void testInitializationORderStatic() {
		InitializerOrderSimple.staticMethod();
		Collection<String> expectedOrder = new ArrayList<String>();
		expectedOrder.add("static class init");
		expectedOrder.add("another static class init");
		// expectedOrder.add("class init");
		// expectedOrder.add("constructor");
		log.info("order:" + InitializerOrderSimple.ORDER_STATICONLY);
		assertThat(InitializerOrderSimple.ORDER_STATICONLY, TestUtil.containsInOrder(expectedOrder));
	}

}
