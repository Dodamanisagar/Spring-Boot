package com.Sagar.SpringCoreDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//when our objects are in different packages--try it by adding(cut and paste) both classes of Common package to util package
/*@SpringBootApplication(scanBasePackages = {"com.sagar.springcoredemo",
		                                   "com.sagar.util"})*/
@SpringBootApplication
public class SpringCoreDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

}
