package com.task2;

public class Employee {
	private String name;
	private String Department;

	public Employee(String name, String department) {
		this.name = name;
		Department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}
}
