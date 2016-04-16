package com.arpit.employee.service.model;

public final class Employee {

	private final int employeeId;
	private final String employeeName;

	public Employee(final int employeeId, final String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

}
