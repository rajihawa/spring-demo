package com.spring.demo1;

import org.springframework.stereotype.Component;

// spring will autowire it to any constructor requring FortuneService class
@Component
public class HappyFortune implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

}
