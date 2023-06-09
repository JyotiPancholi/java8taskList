package com.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CS_Department {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("jiya", "CS_Department", 6529474));
		list.add(new Employee("surekha", "IT_Department", 6529474));
		list.add(new Employee("kavyaa", "CS_Department", 6529474));
		list.add(new Employee("nibandh", "EC_Department", 6529474));
		list.add(new Employee("khyati", "IT_Department", 6529474));
		list.add(new Employee("shruti", "CS_Department", 6529474));
		list.add(new Employee("nehal", "CS_Department", 6529474));
		list.add(new Employee("rupesh", "EC_Department", 6529474));
		
		List<Employee> filtered =  list.stream().filter( dept ->dept.getDepartment()
				.equals("CS_Department")).map(salary -> {
					salary.setSalary(salary.getSalary()+5000);return salary;
					}).collect(Collectors.toList());
		
		filtered.forEach(System.out::println);

	}
}
