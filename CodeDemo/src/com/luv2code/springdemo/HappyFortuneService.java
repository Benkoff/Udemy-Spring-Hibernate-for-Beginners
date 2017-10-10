package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        int index = new Random().nextInt(3);
        String[] phrase = {"Today is your lucky day!", "Good Luck!", "Let the Force be with you!"};
        return phrase[index];
    }
}
