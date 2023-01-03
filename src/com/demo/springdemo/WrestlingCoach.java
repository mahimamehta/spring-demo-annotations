package com.demo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class WrestlingCoach implements Coach{
    @Autowired
    FortuneService randomFortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice kick boxing";
    }

    @Override
    public String getDailyFortune() {
        return randomFortuneService.getFortune();
    }
}
