package com.springdemo;

public class BaseballCoach implements Coach{

	//define a private field for dependency
	private FortuneService fortuneService;
	
	//define constructor for DI
	 public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on batting practice.";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}


