package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStuffApplication {
	
	public SpringStuffApplication() {
	System.out.println("HELLO SPRING");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringStuffApplication.class, args);
	}

}
