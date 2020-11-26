package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAppAnnotation {
	public static void main(String[] args) {

		//read spring config file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		//ICoach coach = context.getBean("thatSillyCoach", ICoach.class); //thatSillyCoach -> component name of TennisCoach
		ICoach coach = context.getBean("tennisCoach", ICoach.class); //default id of component name
		
		//call a method on the bean
		System.out.println(coach.getDailyWorkout());
		
		//call method to get the daily fortune
		System.out.println(coach.getDailyFortune());
		
		//close container
		context.close();
	}
}
