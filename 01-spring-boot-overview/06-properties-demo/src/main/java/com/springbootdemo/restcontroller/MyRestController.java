package com.springbootdemo.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    Name    : Monu KD (monukd01dev)
    Project : 01-spring-boot-demo
    Date    : 18-Oct-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
@RestController
public class MyRestController {

    @Value("${team.name}")
    private String teamName;

    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/")
    public String helloEndPoint() {
        //changed the port number to 2004
        return "custom-properties";
    }

    @GetMapping("/team-info")
    public String devToolCheck() {
        return "Team Name : "+teamName+" Coach Name : "+coachName;
    }



}
