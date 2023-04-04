package com.Sagar.SpringCoreDemo.Common;

import com.Sagar.SpringCoreDemo.Common.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Practice fast balling for 15min.Now!!!!!!";
    }
}
