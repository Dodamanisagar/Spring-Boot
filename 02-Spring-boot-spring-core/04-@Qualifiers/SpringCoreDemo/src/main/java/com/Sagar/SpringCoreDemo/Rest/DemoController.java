package com.Sagar.SpringCoreDemo.Rest;

import com.Sagar.SpringCoreDemo.Common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for the dependency
    private Coach myCoach;

    //@Qualifier used whenever we have multiple objects, and we want to specify which object we want to pass to the spring
    //@Qualifier takes input of the class of which object we want, but initial letter must be small or else will get same error when we wont pass @Qualifier
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach)
    {
        myCoach=theCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkOut()
    {
        return myCoach.getDailyWorkOut();
    }
}
