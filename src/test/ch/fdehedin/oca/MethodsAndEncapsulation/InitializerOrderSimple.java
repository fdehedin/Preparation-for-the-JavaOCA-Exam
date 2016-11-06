package ch.fdehedin.oca.MethodsAndEncapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class InitializerOrderSimple {

	private static final Logger log = Logger.getLogger(InitializerOrderSimple.class.getSimpleName());
	public static final List<String> ORDER = new ArrayList<>();
	public static final List<String> ORDER_STATICONLY = new ArrayList<>();

	
	static {
		ORDER.add("static class init");
		ORDER_STATICONLY.add("static class init");
	}

	static {
		ORDER.add("another static class init");
		ORDER_STATICONLY.add("another static class init");
	}

	{
		ORDER.add("class init");
		// ORDER_STATICONLY.add("class init");
	}

	public InitializerOrderSimple() {
		ORDER.add("constructor");
	}

	public static void staticMethod() {
		// do nothing...
	}

}
