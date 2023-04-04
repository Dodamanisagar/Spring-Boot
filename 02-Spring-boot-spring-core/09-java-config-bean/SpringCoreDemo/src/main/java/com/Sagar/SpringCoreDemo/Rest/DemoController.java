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


    @Autowired
    public DemoController(
            @Qualifier("aquatic") Coach theCoach) {
        System.out.println("Inside "+getClass().getSimpleName()+ " Constructor");
        myCoach=theCoach;

    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkOut()
    {
        return myCoach.getDailyWorkOut();
    }


}
