package ch.fdehedin.test.spring.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ch.fdehedin.test.spring.di.services.EmailService;
import ch.fdehedin.test.spring.di.services.MessageService;

@Configuration
@ComponentScan(value = { "ch.fdehedin.test.spring.di.consumer" })
public class Config {

	@Bean
	public MessageService getMessageService() {
		return new EmailService();
	}

}
