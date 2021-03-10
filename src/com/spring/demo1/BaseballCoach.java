package com.spring.demo1;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public FortuneService getFortuneService() {
        return this.fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

}
