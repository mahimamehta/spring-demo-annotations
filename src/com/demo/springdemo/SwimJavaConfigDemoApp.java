package com.demo.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // retrieve bean
        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);


        // use the bean
        System.out.println("swimCoach Coach says: " + swimCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println("swimCoach Coach says: " + swimCoach.getDailyFortune());

        // call our new methods for property injection
        System.out.println(swimCoach.getEmail());
        System.out.println(swimCoach.getTeam());
        //close the context
        context.close();
    }
}
