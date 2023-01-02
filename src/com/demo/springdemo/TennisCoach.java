package com.demo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    //implementing constructor injection
    @Autowired
    TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
