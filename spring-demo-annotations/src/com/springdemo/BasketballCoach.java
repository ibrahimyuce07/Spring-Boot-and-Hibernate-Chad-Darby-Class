package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements ICoach {

	@Override
	public String getDailyWorkout() {
		return "Practice your slam dunk.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
