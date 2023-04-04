package com.Sagar.SpringCoreDemo.Common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component//marks class as spring bean
public class CricketCoach implements Coach {

    public CricketCoach ()
    {
        System.out.println("Inside "+getClass().getSimpleName()+ " Constructor");
    }

    //define our init method
    @PostConstruct //executes first when we start our application
    public void startProcess(){
        System.out.println("starting: "+getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy //executes at the end when we stop our application
    public void endProcess(){
        System.out.println("ending: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "Practice fast balling for 15min.Now !!!!!!";
    }
}
