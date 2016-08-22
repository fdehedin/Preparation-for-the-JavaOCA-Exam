package ch.fdehedin.test.spring.di.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.fdehedin.test.spring.helloworld.controller.HelloWorldController;

public class TwitterService implements MessageService {

	private final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

	@Override
	public boolean sendMessage(final String msg, final String rec) {
		logger.debug(String.format("TwitterService: Message %1 sent to %2", msg, rec));
		return true;
	}

}
