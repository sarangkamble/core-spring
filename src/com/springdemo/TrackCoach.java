package com.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(){
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a Hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it : "+fortuneService.getFortune();
	}

	// add an init method 
	public void doMyStartupStuff() {
		System.out.println("TrachCoach: inside method doMyStartupStuff");
	}
	
	// add an destroy method 
	public void doMyCleanupStuff() {
		System.out.println("TrachCoach: inside method doMyCleanupStuff");
	}
}