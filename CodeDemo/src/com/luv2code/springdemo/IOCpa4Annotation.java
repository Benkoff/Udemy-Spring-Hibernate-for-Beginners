package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

		// read spring config file
		// get the bean from spring container
		// call a method on the bean
		// close the context
		
public class IOCpa4Annotation {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("pa4-applicationContext.xml");

		Coach coach = context.getBean("pingPongAnnotation", Coach.class);
		
		System.out.println(coach.getDailyFortune() + " " + coach.getDailyWorkout());
		
		context.close();
	}
}
