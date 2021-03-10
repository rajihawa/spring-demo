package com.spring.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// thatSillyCoach is the bean id
// specified bean id
// @Component("thatSillyCoach")
// default bean id = tennisCoach
@Component
public class TennisCoach implements Coach {

    // this will automaticlly inject a value without the need for setters
    @Autowired
    @Qualifier("randomFortune") // in case there was multiple components that implement fortuneServices
    private FortuneService fortuneService;

    public TennisCoach() {
    }

    // spring will scan any component with id fortuneService and inject it
    // @Autowired
    // public TennisCoach(FortuneService fortuneService) {
    // this.fortuneService = fortuneService;
    // }

    public FortuneService getFortuneService() {
        return this.fortuneService;
    }

    // when autowire a setter function it doesnt have to be named like a setter and
    // method with @Autowired will be automaticly injected
    // @Autowired
    // public void changeFortuneService(FortuneService fortuneService) {
    // this.fortuneService = fortuneService;
    // }

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return fortuneService.getFortune();
    }

    // bean life cycle methods
    @PostConstruct
    public void didMount() {
        System.out.println("Class constructed");
    }

    @PreDestroy
    public void onDestroy() {
        System.out.println("Class destroyed");
    }

}
