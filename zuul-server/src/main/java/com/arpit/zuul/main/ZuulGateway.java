package com.arpit.zuul.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulGateway {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGateway.class, args);
	}

}
