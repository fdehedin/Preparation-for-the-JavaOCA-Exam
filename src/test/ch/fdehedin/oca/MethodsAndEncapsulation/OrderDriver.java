package ch.fdehedin.oca.MethodsAndEncapsulation;

import java.util.logging.Logger;

public class OrderDriver {

	private static final Logger log = Logger.getLogger(OrderDriver.class.getSimpleName());

	private String test = "";
	
	private OrderDriver(String test){
		test = test;
	}
	
	public static void main(String[] args) {
		System.out.println(Order.result+" ");
		System.out.println(Order.result+" ");
		new Order();
		new Order();
		System.out.println(Order.result+" ");
		
		Order order = new Order();
		order = null;
		order.test();
	
	}
	
	
}
