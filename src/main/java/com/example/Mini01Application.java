package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example")
@EntityScan("com.example.model")
@EnableJpaRepositories(basePackages = "com.example.repo")
@ComponentScan(basePackages = "com.example.controller")
@ComponentScan(basePackages = "com.example.service")
public class Mini01Application {

	public static void main(String[] args) {
		SpringApplication.run(Mini01Application.class, args);
	}

}
