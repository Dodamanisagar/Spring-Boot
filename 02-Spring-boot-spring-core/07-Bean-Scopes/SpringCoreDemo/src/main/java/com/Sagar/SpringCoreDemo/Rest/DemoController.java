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
    private Coach anotherCoach;

    @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach theCoach,
            @Qualifier("cricketCoach") Coach theanotherCoach) {
        System.out.println("Inside "+getClass().getSimpleName()+ " Constructor");
        myCoach=theCoach;
        anotherCoach=theanotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkOut()
    {
        return myCoach.getDailyWorkOut();
    }

    @GetMapping("/check")
    public String check()
    {
        return "Comparing beans: myCoach==anotherCoach ---"+ (myCoach==anotherCoach);
    }
}
