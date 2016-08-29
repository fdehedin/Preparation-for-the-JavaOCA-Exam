package ch.fdehedin.test.spring.helloworld.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	private static final Logger logger = LoggerFactory.getLogger(HelloWorldServiceImpl.class);

	@Override
	public String getDesc() {

		logger.debug("getDesc() is executed!");

		return "Gradle + Spring MVC Hello World Example";

	}

	@Override
	public String getTitle(final String name) {

		logger.debug("getTitle() is executed! $name : {}", name);

		if (StringUtils.isEmpty(name)) {
			return "Hello World";
		} else {
			return "Hello " + name;
		}

	}

}