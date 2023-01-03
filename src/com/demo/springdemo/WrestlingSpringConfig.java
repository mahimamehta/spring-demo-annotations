package com.demo.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WrestlingSpringConfig {

    @Bean
    public FortuneService randomFortuneService(){
        return new RandomFortuneService();
    }

    @Bean
    public Coach wrestlingCoach(){
        WrestlingCoach wrestlingCoach = new WrestlingCoach();
        return wrestlingCoach;
    }
}
