package com.example.demo;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchSplitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchSplitApplication.class, args);
	}
}
