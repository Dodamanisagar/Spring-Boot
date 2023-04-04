package com.Sagar.SpringCoreDemo.Config;

import com.Sagar.SpringCoreDemo.Common.Coach;
import com.Sagar.SpringCoreDemo.Common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
