package com.demo.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    @Value("${foo.team}")
    private String team;

    @Value("${foo.email}")
    private String email;

    FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "swim 1000 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getTeam() {
        return team;
    }

    public String getEmail() {
        return email;
    }
}
