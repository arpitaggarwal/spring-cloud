package com.arpit.employee.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arpit.employee.service.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping("/get")
	public Employee get() {
		return new Employee(1, "Employee - One");
	}

}
