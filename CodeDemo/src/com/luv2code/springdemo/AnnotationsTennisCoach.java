package com.luv2code.springdemo;

import javax.swing.plaf.FontUIResource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnnotationsTennisCoach implements AnnotationsCoach {
	private AnnotationsFortuneService fortuneService;
	
	@Autowired
	public AnnotationsTennisCoach(AnnotationsFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
