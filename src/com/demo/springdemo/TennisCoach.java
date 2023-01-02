package com.demo.springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope("prototype")
public class TennisCoach implements Coach, DisposableBean {

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

    // this method is called just before the bean lifecycle is over
    @Override
    public void destroy() throws Exception {
        System.out.println("Inside TennisCoach- destroy method provided by DisposableBean interface. " +
                "This can be used with beans with prototype scope ");
    }

    // define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("TennisCoach: Inside doMyStartupStuff");
    }
}
