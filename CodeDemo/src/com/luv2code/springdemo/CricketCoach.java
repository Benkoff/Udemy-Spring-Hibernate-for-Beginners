package com.luv2code.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddsess;
    private String team;

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public CricketCoach() {
        this(new HappyFortuneService());
        System.out.println(this.getClass().getSimpleName() + " inside no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Just play the game";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println("...inside setter in " + this.getClass().getSimpleName());
        this.fortuneService = fortuneService;
    }

    public void setEmailAddsess(String emailAddsess) {
        this.emailAddsess = emailAddsess;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddsess() {
        return emailAddsess;
    }

    public String getTeam() {
        return team;
    }
}
