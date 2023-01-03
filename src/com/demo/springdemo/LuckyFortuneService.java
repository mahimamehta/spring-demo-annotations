package com.demo.springdemo;

import org.springframework.stereotype.Component;

//@Component
public class LuckyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is an amazing day!";
    }
}
