package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAppAnnotationPA4 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICoach coach = context.getBean("basketballCoach", ICoach.class);
		
		System.out.println(coach.getDailyWorkout());

		context.close();
	}

}

//#PA4 : practice activity 4