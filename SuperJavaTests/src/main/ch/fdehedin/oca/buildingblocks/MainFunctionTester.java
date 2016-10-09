package ch.fdehedin.oca.buildingblocks;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainFunctionTester {

	private static Logger log = Logger.getLogger(MainFunctionTester.class.getName());
	
	public static void main(String args[]) {
		for(int i=0;i<args.length;i++){
			log.log(Level.INFO,"arg: "+args[i]);			
		}

	}
	
}
