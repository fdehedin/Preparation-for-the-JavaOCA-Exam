package ch.fdehedin.oca.OperatorsAndStatements;

import java.util.logging.Logger;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.*;

import ch.fdehedin.oca.Util;

/**
 * @author fdehedin
 *
 */
public class StatementTester {

	private static final Logger log = Logger.getLogger(StatementTester.class.getSimpleName());
	
	@Test
	public void simpleStatementTest() {
		int hourOfDay = 8;
		if(hourOfDay<11){
			assertTrue("hour of the day should be less than 11", hourOfDay<8);
		}
	}


}
