package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// IOC == Inversion Of Control

public class IOCpa3xml {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("pa3-applicationContext.xml");

		Coach coach = context.getBean("myCoach", Coach.class);
		Coach coach2 = context.getBean("myCoach", Coach.class);
		
		System.out.println("Same objects: " + (coach == coach2));
		
		context.close();
	}
}
