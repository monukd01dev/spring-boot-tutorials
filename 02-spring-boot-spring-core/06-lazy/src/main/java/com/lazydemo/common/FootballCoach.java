package com.lazydemo.common;

import org.springframework.stereotype.Component;

/*
    Name    : Monu KD (monukd01dev)
    Project : 04-qualifier
    Date    : 19-Oct-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
@Component
public class FootballCoach implements Coach{

    public FootballCoach() {
        System.out.println("In Constructor : "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Goal Practice for 20 Days";
    }
}
