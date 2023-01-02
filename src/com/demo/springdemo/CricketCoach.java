package com.demo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    //defining property injections
    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

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
    @Qualifier("happyFortuneService")
    public void doSomeCrazyStuff(FortuneService fortuneService){
        System.out.println("Cricket Coach: inside doSomeCrazyStuff");
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return "Cricket Coach email id is: " + email;
    }

    public String getTeam() {
        return "Cricket Coach team is: " + team;
    }

}
