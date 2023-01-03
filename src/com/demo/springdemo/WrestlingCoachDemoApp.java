package com.demo.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WrestlingCoachDemoApp {

    public static void main(String[] args) {

        // load the spring config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WrestlingSpringConfig.class);

        // extract bean from spring container
        Coach coach = context.getBean("wrestlingCoach", Coach.class);

        // use the methods of the bean
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());

        // close the context
        context.close();
    }
}
