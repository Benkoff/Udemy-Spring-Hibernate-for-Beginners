package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class PingPongAnnotation implements Coach {

    public PingPongAnnotation() {
        System.out.println(this.getClass().getSimpleName() + " inside no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Ping pong and pong ping after that";
    }
    
    @Override
    public String getDailyFortune() {
		return "Ping your pong!";    	
    }
}
