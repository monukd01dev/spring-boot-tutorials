package com.qualifierdemo.restcontrollers;

import com.qualifierdemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    Name    : Monu KD (monukd01dev)
    Project : 01-constructor-injection
    Date    : 19-Oct-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
@RestController
public class DemoController {

    private Coach myCoach;

    //constructor-injection
    @Autowired
    public DemoController(Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/")
    public String homePage() {
        return "Get Your Daily Workout firing /get-workout";
    }

    @GetMapping("/get-workout")
    public String getDailWorkout() {
        return myCoach.getDailyWorkout();
    }


}
