package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoAppSwimJavaConfig {
	public static void main(String[] args) {

		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		// ICoach coach = context.getBean("thatSillyCoach", ICoach.class);
		// //thatSillyCoach -> component name of TennisCoach
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class); // default id of component name

		// call a method on the bean
		System.out.println(coach.getDailyWorkout());

		// call method to get the daily fortune
		System.out.println(coach.getDailyFortune());

		// call our new swimcoach methods...has the props values injected
		System.out.println("email: " + coach.getEmail());
		System.out.println("team: " + coach.getTeam());

		// close container
		context.close();
	}
}
