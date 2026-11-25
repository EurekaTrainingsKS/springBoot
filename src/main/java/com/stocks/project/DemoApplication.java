package com.stocks.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	//as we run this DemoApplication.java class, so far it is just an JAVA class
	//and will look for main() which is normal so far.
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//here it will look for SpringApplication class then it will treat it as Spring Application
		//In run method we are a Class(which is our custom class) DemoApplication
		//On top of DemoApplication we annotated it as @SpringBootApplication
		//finally, it treats it as an SpringBootApplication
		//@SpringBootApplication is combination of 3 more annotations
		//1=>@ComponentScan , which will scans all classes and Objects defined, and will start managing them
		//2=>@EnableAutoConfig , which will automatically wire the beans/Objects
		//3=>@SpringAppCongig , will provide whatever things that we needed to start an SpringBoot app
		System.out.println("Spring boot app has started");
	}

}
