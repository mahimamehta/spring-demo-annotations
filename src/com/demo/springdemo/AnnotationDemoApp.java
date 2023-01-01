package com.demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach pingPongCoach = context.getBean("pingPongCoach", Coach.class);
        Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
        Coach khoKhoCoach = context.getBean("khoKhoCoach", Coach.class);

        // use the bean
        System.out.println("Tennis Coach says : " + tennisCoach.getDailyWorkout());
        System.out.println("Ping Pong Coach says : " + pingPongCoach.getDailyWorkout());
        System.out.println("Cricket Coach says: " + cricketCoach.getDailyWorkout());
        System.out.println("KhoKho Coach says: " + khoKhoCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println("Tennis Coach says : " + tennisCoach.getDailyFortune());
        System.out.println("Ping Pong Coach says : " + pingPongCoach.getDailyFortune());
        System.out.println("Cricket Coach says: " + cricketCoach.getDailyFortune());
        System.out.println("KhoKho Coach says: " + khoKhoCoach.getDailyFortune());
        //close the context
        context.close();
    }
}
