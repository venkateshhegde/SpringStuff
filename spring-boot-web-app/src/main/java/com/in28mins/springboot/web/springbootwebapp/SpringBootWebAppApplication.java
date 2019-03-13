package com.in28mins.springboot.web.springbootwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.in28mins.springboot.web")
public class SpringBootWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebAppApplication.class, args);
	}
}
