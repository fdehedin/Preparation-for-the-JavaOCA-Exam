package ch.fdehedin.test.spring.di.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ch.fdehedin.test.spring.di.services.MessageService;

@Component
public class MyApplication {

	@Autowired
	private MessageService messageService;

	public boolean processMessage(final String msg, final String rec) {
		return this.messageService.sendMessage(msg, rec);
	}

}
