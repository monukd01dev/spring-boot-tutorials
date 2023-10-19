package com.constructorinjection;

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
    @Override
    public String getDailyWorkout() {
        return "15 min run";
    }
}
