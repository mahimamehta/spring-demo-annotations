package com.demo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class KhoKhoCoach implements Coach{

    //field injection
    @Autowired
    @Qualifier("randomFortuneService")
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

    // define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("KhoKhoCoach: Inside doMyStartupStuff");
    }


    // define my destroy method
    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println("KhoKhoCoach: Inside doMyCleanUpStuff");
    }
}
