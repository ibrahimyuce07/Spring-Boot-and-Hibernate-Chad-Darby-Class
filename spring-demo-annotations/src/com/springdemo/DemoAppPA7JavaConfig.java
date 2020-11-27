package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoAppPA7JavaConfig {
	public static void main(String[] args) {

		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PA7Config.class);

		// get the bean from spring container
		// ICoach coach = context.getBean("thatSillyCoach", ICoach.class);
		// //thatSillyCoach -> component name of TennisCoach
		BasketballCoachPA7 coach = context.getBean("basketballCoach", BasketballCoachPA7.class); // default id of
																									// component name

		// call a method on the bean
		System.out.println(coach.getDailyWorkout());

		// call method to get the daily fortune
		System.out.println(coach.getDailyFortune());

		// close container
		context.close();
	}
}
