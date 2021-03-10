package com.spring.demo1;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

}
