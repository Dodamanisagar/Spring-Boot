package com.Sagar.SpringBoot.Demo.MyCoolApp.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {
    //inject properties for:coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose new endpoint for teamInfo
    @GetMapping("/teaminfo")
    public String getTeamInfo()
    {
        return "Coach: "+coachName +", Team Name: "+ teamName;
    }


    //Expose "/" that return "Hello Welcome To my App"
    @GetMapping
    public String sayHello() {
        return "Hello Welcome To my App";
    }

    //Expose a new endpoint for workout
    @GetMapping("/workout")
    public String GetDailyWorkOut() {
        return "Run a hard 5k!";
    }

    //Expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String GetDailyFortune() {
        return " Today is your lucky day";
    }


}
