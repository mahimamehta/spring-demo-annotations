package com.demo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    CricketCoach(){
        System.out.println("CricketCoach: Inside defaut constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Do net practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // define a method for method injection
    @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService){
        System.out.println("CricketCoach Coach: inside doSomeCrazyStuff");
        this.fortuneService = fortuneService;
    }
}
