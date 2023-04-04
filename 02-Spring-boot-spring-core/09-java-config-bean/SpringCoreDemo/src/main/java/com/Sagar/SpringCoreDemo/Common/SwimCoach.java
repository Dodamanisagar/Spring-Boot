package com.Sagar.SpringCoreDemo.Common;
//not using @Component on purpose
public class SwimCoach implements Coach{

    public SwimCoach()
    {
        System.out.println("InSide "+ getClass().getSimpleName() +"Class");
    }
    @Override
    public String getDailyWorkOut() {
        return "Calling SwimCoach";
    }
}
