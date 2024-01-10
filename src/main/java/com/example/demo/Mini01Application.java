package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.example.model")
@SpringBootApplication
public class Mini01Application {

	public static void main(String[] args) {
		SpringApplication.run(Mini01Application.class, args);
	}

}
