package com.springboot1.assignemt.main;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EntityScan(basePackages = "com.springboot1.assignment.main.model")  // Ensure Hibernate finds your entity
@EnableJpaRepositories(basePackages = "com.springboot1.assignment.main.repository")  // If you have a repository package
@ComponentScan(basePackages = "com.springboot1.assignment.main")  // Ensure Spring scans everything
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

}
