package com.Sagar.SpringCoreDemo.Common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component//marks class as spring bean
@Primary
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Calling TrackCoach";
    }
}
