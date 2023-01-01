package com.demo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KhoKhoCoach implements Coach{

    //field injection
    @Autowired
    private FortuneService fortuneService;

    KhoKhoCoach(){
        System.out.println("KhoKhoCoach: Inside defaut constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Run 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
