package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// define bean for our sad fortune
	@Bean
	public IFortuneService sadFortuneService() { // metot ismi bean id
		return new SadFortuneService();
	}

	// define bean for our swim coach AND inject dependencies
	@Bean
	public ICoach swimCoach() {
		return new SwimCoach(sadFortuneService()); // yukarıdaki bean id ile aynı olmalı.
	}

}
