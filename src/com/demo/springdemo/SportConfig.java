package com.demo.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// @Configuration tells the spring that this is the java configuration
@Configuration
@PropertySource("classpath:sport.properties")
// this component scan is optional, if this annotation is used them it will create beans of all the classes in that package which has @Component annotation
//@ComponentScan("com.demo.springdemo")
public class SportConfig {

    // define bean for luckyFortuneService
    @Bean
    public FortuneService luckyFortuneService(){
        return new LuckyFortuneService();
    }

    // define bean for swim coach and inject dependencies
    @Bean
    public Coach swimCoach(){
        SwimCoach swimCoach = new SwimCoach(luckyFortuneService());
        return swimCoach;
    }
}
