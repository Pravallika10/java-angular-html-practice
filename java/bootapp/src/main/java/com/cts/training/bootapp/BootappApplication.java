package com.cts.training.bootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = {"com.cts.training.bootapp","com.extra.resource"})
@SpringBootApplication
public class BootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootappApplication.class, args);
	}
//expose by bean
}

// use this as 1. spring config class-@configuration
// 2.spring boot configuration
// a. read pom.xml and config the application
//b. read application.properties and config the application
// c.component scanning : by default component scanning root path is  the pkg and sub pkg that contains main class
// can be customized :com.cts.training.bootapp,com.extra.resource,com ,....