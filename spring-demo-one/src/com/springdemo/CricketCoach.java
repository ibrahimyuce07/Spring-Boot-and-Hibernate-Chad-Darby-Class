package com.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public FortuneService getFortuneService() {
		return fortuneService;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	// create a no-arg cons
	public CricketCoach() {
		System.out.println("CricketCoach : inside no-arg constructor");
	}

	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside setter method");
		this.fortuneService = fortuneService;
		
	}



	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
