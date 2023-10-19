package com.qualifierdemo.common;

import org.springframework.context.annotation.Primary;
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
@Primary // have lower priority than @Qualifier and overwritten by @Qualifier(use @Qualifier that's recommended)
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "15 min run so you don't run out";
    }
}
