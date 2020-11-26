package com.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

	//add an init method
	public void doMyStartupStuff() {
		System.out.println("Trackcoach : inside method #doMyStartupStuff");
	}
	//add destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("Trackcoach : inside method #doMyCleanupStuffYoYo");

	}
}
