package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class practiceActivity3Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("practiceActivity3-applicationContext.xml");

		Coach coach = context.getBean("myCoach", Coach.class);
		Coach coach2 = context.getBean("myCoach", Coach.class);
		
		System.out.println("Same objects: " + (coach == coach2));
		
		context.close();
	}

}
