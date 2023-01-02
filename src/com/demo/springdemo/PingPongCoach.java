package com.demo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach{

    private FortuneService fortuneService;

    PingPongCoach(){
        System.out.println("PingPong Coach: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice smash shots";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // define setter method for setter injection
    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService){
        System.out.println("PingPong Coach: inside setFortuneService");
        this.fortuneService = fortuneService;
    }
}
