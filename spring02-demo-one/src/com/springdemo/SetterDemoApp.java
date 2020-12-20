package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args) {

		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrive a bean from spring container
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);

		// call method on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());

		//call new methods to get literal values
		
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeam());
		// close the context
		context.close();
	}

}
