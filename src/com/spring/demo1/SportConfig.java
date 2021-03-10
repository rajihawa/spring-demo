package com.spring.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.demo1")
public class SportConfig {

    // happyFortune method name is the bean id
    @Bean
    public FortuneService happyFortune() {
        return new HappyFortune();
    }

    // swimCoach method name is the bean id
    @Bean
    public Coach swimCoach() {
        SwimCoach mySwimCoach = new SwimCoach(happyFortune());

        return mySwimCoach;
    }

}
