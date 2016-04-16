package com.arpit.employee.service.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = { "com.arpit.employee.service.controller" })
public class Main {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "employee-service-one");
		SpringApplication.run(Main.class, args);
	}
}