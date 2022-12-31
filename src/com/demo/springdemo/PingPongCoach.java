package com.demo.springdemo;

import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice smash shots";
    }
}
