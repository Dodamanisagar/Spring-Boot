package com.Sagar.SpringCoreDemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkOut() {
        return "Practice fast balling for 15min.Now!!!!!!";
    }
}
