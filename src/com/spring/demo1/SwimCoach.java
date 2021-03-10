package com.spring.demo1;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return fortuneService.getFortune();
    }

}
