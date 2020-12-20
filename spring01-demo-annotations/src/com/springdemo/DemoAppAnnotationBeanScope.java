package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAppAnnotationBeanScope {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		ICoach coach = context.getBean("tennisCoach", ICoach.class);
		ICoach alphaCoach = context.getBean("tennisCoach", ICoach.class);
		// check if they are the same;
		boolean result = (coach == alphaCoach);

		// print out the result
		System.out.println("\nPointing the same object: " + result);
		System.out.println("\nMemory location for coach: " + coach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		// Pointing the same object: true bc default scope is singleton
		// Pointing the same object: false bc we set @Scope("prototype") inside
		// TennisCoach.class

		// close context
		context.close();
	}

}
