package com.spring.demo1;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public FortuneService getFortuneService() {
        return this.fortuneService;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void init() {
        System.out.println("Initialzing...");
    }

    public void kill() {
        System.out.println("Killing...");
    }

    @Override
    public String toString() {
        return "{" + " fortuneService='" + getFortuneService() + "'" + ", emailAddress='" + getEmailAddress() + "'"
                + ", team='" + getTeam() + "'" + "}";
    }

}
