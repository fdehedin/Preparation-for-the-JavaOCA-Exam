package ch.fdehedin.test.spring.di;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ch.fdehedin.test.spring.di.config.Config;
import ch.fdehedin.test.spring.di.consumer.MyApplication;

public class MessageServiceTest {

	@Test
	public void processMessage() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		MyApplication app = context.getBean(MyApplication.class);

		boolean result = app.processMessage("Hi there, please kljaökdsjöfdsa", "hans.meier@test.ch");

		context.close();

		assertTrue(result);
 
	}

}
