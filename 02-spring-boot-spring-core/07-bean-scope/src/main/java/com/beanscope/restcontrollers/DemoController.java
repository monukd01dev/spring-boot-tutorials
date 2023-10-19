package com.beanscope.restcontrollers;

import com.beanscope.common.Coach;
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
    private Coach anotherCoach;

    //constructor-injection
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach myCoach,@Qualifier("cricketCoach") Coach anotherCoach) {
        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;
        System.out.println("In Constructor : "+ getClass().getSimpleName());
    }

    @GetMapping("/")
    public String homePage() {
        return "Get Your Daily Workout firing /get-workout";
    }

    @GetMapping("/get-workout")
    public String getDailWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String scopeCheck() {
        if (myCoach == anotherCoach) {
            return "<h1>SCOPE : Singleton</h1>";
        } else {
            return "<h1>SCOPE : Prototype</h1>";
        }
    }

}
