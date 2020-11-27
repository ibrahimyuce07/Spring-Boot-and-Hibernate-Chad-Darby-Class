package com.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements ICoach {

	@Autowired
	@Qualifier("fileFortuneService")
	private IFortuneService fortuneService;

	public TennisCoach() {
		System.out.println("This is a default constructor inside TennisCoach");
	}

	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">>TennisCoach inside #doMyStartupStuff");
	}
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">>TennisCoach inside #doMyCleanupStuff");
	}
	
	
	/*
	 * //SETTER INJECTION //define a default constructor public TennisCoach() {
	 * System.out.println(">>TennisCoach : inside default constructor."); } //define
	 * a setter method
	 * 
	 * @Autowired public void setFortuneService(IFortuneService fortuneService) {
	 * System.out.println(">>TennisCoach : inside setFortuneService");
	 * this.fortuneService = fortuneService; }
	 */

	// CONSTRUCTOR INJECTION
	/*
	 * @Autowired public TennisCoach(IFortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
