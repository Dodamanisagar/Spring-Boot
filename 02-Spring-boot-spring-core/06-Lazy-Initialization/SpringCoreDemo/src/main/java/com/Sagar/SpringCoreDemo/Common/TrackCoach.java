package com.Sagar.SpringCoreDemo.Common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component//marks class as spring bean
@Lazy//try without using this annotation also check what is printing
public class TrackCoach implements Coach{

    public TrackCoach ()
    {
        System.out.println("Inside "+getClass().getSimpleName()+ " Constructor");
    }
    @Override
    public String getDailyWorkOut() {
        return "Calling TrackCoach";
    }
}
