package com.insilicosoft.portal.svc.welcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class WelcomeSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeSvcApplication.class, args);
	}

}
