package ch.fdehedin.test.spring.di.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.fdehedin.test.spring.helloworld.controller.HelloWorldController;
import ch.qos.logback.classic.LoggerContext;
public class EmailService implements MessageService {

	private final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

	@Override 
	public boolean sendMessage(final String msg, final String rec) {
	//	System.out.println(String.format("EmailService: Message %1s sent to %2s", msg, rec));
		 LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		  // print logback's internal status
	//	  StatusPrinter.print(lc);
		logger.debug(String.format("EmailService: Message %1s sent to %2s", msg, rec));
		return true;
	} 

}
