package com.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryIncreament {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Jiya", 550000));
		list.add(new Employee("luv", 6546765));
		list.add(new Employee("divya", 432356));
		list.add(new Employee("Nandini", 875745));
		list.add(new Employee("sakshi", 550667));
		list.add(new Employee("megha", 716645));
		list.add(new Employee("priyanka", 56563));
		list.add(new Employee("keshvi", 578725));
		
//		List<Employee> employees = list.stream().map(emp -> {
//		emp.setSalary(emp.getSalary()+10000);
//		return emp;
//		}).collect(Collectors.toList());

		list.stream().map(emp -> {
			emp.setSalary(emp.getSalary()+10000);
			return emp;
		}).forEach(System.out::println);
	}
}
