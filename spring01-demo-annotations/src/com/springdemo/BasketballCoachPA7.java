package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoachPA7 implements ICoach {

	private IFortuneService fortuneService;

	public BasketballCoachPA7(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your slam dunk.";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
