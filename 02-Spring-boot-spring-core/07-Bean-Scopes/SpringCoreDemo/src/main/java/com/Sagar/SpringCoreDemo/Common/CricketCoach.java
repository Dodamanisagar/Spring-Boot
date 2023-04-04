package com.Sagar.SpringCoreDemo.Common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component//marks class as spring bean
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
