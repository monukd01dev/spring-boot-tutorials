package com.beanscope.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
    Name    : Monu KD (monukd01dev)
    Project : 01-constructor-injection
    Date    : 19-Oct-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
@Component
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("In Constructor : "+ getClass().getSimpleName());
    }

    @PostConstruct
    public void init() {
        System.out.println("Init Method : "+getClass().getSimpleName());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy Method : "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "15 min run";
    }
}
