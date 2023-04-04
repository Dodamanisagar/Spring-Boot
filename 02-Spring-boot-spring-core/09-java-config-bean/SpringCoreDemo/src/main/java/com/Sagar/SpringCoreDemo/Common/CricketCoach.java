package com.Sagar.SpringCoreDemo.Common;

import org.springframework.stereotype.Component;

@Component//marks class as spring bean
public class CricketCoach implements Coach {

    public CricketCoach ()
    {
        System.out.println("Inside "+getClass().getSimpleName()+ " Constructor");
    }
    @Override
    public String getDailyWorkOut() {
        return "Practice fast balling for 15min.Now !!!!!!";
    }
}
