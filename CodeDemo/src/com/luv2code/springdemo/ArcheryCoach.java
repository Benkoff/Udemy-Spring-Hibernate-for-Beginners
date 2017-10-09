package com.luv2code.springdemo;

public class ArcheryCoach implements Coach {
    private FortuneService fortuneService;

    public ArcheryCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Hit 100 yard target 10 times";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
