package com.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {

	public static void main(String[] args) {
		List<Employee> list  =  new ArrayList<>();
		list.add(new Employee("jiya","java developer"));
		list.add(new Employee("nidhi","pythn developer"));
		list.add(new Employee("vidharvi","java developer"));
		list.add(new Employee("jyoti","java developer"));
		list.add(new Employee("lavisha","pythn developer"));
		list.add(new Employee("mukti","java developer"));
		list.add(new Employee("siya","react developer"));
		list.add(new Employee("khushi","java developer"));
		list.add(new Employee("lavanya","php developer"));
		
		
		List<Employee> filtered = list.stream().filter(employee ->employee.getDepartment()
				.equals("java developer")).collect(Collectors.toList());
		
		for (Employee employee2 : filtered) {
			System.out.println("Name : "+employee2.getName()+"  -   Department :  "+employee2.getDepartment());
		}
	}
}
