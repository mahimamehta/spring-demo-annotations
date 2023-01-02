package com.demo.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    String[] fortunes;
    Random random;

    RandomFortuneService(){
        fortunes = new String[]{"You are lucky", "Smile and be happy", "Hello Sunshine"};
        random = new Random();
    }
    @Override
    public String getFortune() {
        return fortunes[random.nextInt(3)];
    }
}
