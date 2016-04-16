package com.arpit.eureka.client.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.arpit.service.model.Employee;

@EnableDiscoveryClient
@SpringBootApplication
@EnableAutoConfiguration
@EnableFeignClients
public class EurekaClientApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "eureka-client");
		SpringApplication.run(EurekaClientApplication.class, args);
	}
}

@RestController
class HomeController {

	@Autowired
	@LoadBalanced
	protected RestTemplate restTemplate;

	@RequestMapping("/{applicationName}/{serviceName}/get")
	public Employee get(@PathVariable String applicationName,
			@PathVariable String serviceName) {
		return restTemplate.getForObject("http://" + applicationName + "/"
				+ serviceName + "/get", Employee.class);
	}
}