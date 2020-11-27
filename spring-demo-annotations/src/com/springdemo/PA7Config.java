package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PA7Config {

	@Bean
	public IFortuneService mehFortuneService() {
		return new MehFortuneServicePA7();
	}

	@Bean
	public ICoach basketballCoach() {
		return new BasketballCoachPA7(mehFortuneService());
	}
}
