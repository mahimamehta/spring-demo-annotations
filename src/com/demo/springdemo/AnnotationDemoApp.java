package com.demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach pingPongCoach = context.getBean("pingPongCoach", Coach.class);

        // use the bean
        System.out.println("Tennis Coach says : " + tennisCoach.getDailyWorkout());
        System.out.println("Ping Pong Coach says : " + pingPongCoach.getDailyWorkout());
        //close the context
        context.close();
    }
}
