package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemouuetApplication {

	public static void main(String[] args) {

		String ev= System.getenv().get("PORT");

		SpringApplication.run(DemouuetApplication.class, args);
	}
}
