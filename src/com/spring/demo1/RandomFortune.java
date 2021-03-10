package com.spring.demo1;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortune implements FortuneService {

    private String[] data = { "Beware of the worlf in sheep's clothing", "Diligence is the mother of good luck",
            "the hourney is the reward" };

    // create a random number generator
    private Random rnd = new Random();

    @Override
    public String getFortune() {
        // get a random number based on the size of the array data
        int index = rnd.nextInt(data.length);

        return data[index];
    }

}
