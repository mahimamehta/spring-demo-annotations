package com.demo.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {

        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // retrieve bean
        Coach khoKhoCoach = context.getBean("khoKhoCoach", Coach.class);


        // use the bean
        System.out.println("KhoKho Coach says: " + khoKhoCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println("KhoKho Coach says: " + khoKhoCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
