package com.nextgen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages="com.nextgen.repository")
@SpringBootApplication
public class TestResultsWeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestResultsWeServiceApplication.class, args);
	}

}

