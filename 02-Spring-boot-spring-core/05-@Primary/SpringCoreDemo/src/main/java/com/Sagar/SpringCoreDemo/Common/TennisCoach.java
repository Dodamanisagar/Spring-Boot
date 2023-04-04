package com.Sagar.SpringCoreDemo.Common;

import org.springframework.stereotype.Component;

@Component//marks class as spring bean
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Calling Tennis Coach";
    }
}
