package com.luv2code.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
        return fortuneService.getFortune();
	}
	
	public void doMyStartup() {
		System.out.println("Beans init method");
	}
	
	public void doMyShutdown() {
		System.out.println("Beans destroy method");
	}
}










