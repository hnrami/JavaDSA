package com.meybise.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueEmployeeNames {

	public static void main(String[] args) {
		
		List<Employee> employees = employeeRecord();
		
		
		//uniqueValue(employees);
	
		//Count the total number of employees in the database.
		
		//System.out.println(employees.stream().count());
		
		//startWithA(employees);
		
		attended(employees);

	}

	private static void attended(List<Employee> employees) {
		//Get a list of employees who have attended more than 75% of classes.
		List<Employee> filteredEmployees =	employees.stream().filter(emp -> emp.getAttendance() > 90).collect(Collectors.toList());
		filteredEmployees.forEach(System.out::println);
	}

	private static void startWithA(List<Employee> employees) {
		//Filter employees with the first name starting with the letter “A”.
		
		//List<Employee> filteredEmployees = employees.stream().filter(x -> x.getFname().startsWith("A")).collect(Collectors.toList());
		
		/* List<String> filteredEmployees = employees.stream().filter(x -> x.getFname().startsWith("A"))
															 .map(x -> x.getDepartment() +"-"+ x.getEmail())
															 .collect(Collectors.toList()); */
															 
		List<String> filteredEmployees = employees.stream().filter(x -> x.getFname().startsWith("E")  && "HR".equalsIgnoreCase(x.getDepartment()))
																	 .map(x -> x.getDepartment() +"-"+ x.getEmail())
																	 .collect(Collectors.toList());
		filteredEmployees.forEach(System.out::println);
	}

	private static void uniqueValue(List<Employee> employees) {
		List<String> output = employees.stream().map(Employee::getFname).distinct().collect(Collectors.toList());
		
		System.out.println(output);
	}

	private static List<Employee> employeeRecord() {
		List<Employee> employees = Arrays.asList(
	            new Employee(1, "john@example.com", "John", "Doe", "IT", 101, "Math", 10, 95.5),
	            new Employee(2, "alice@example.com", "Alice", "Smith", "CS", 102, "Physics", 12, 92.0),
	            new Employee(3, "john2@example.com", "John", "Walker", "IT", 103, "Math", 9, 85.0),
	            new Employee(4, "emma@example.com", "Emma", "Brown", "HR", 104, "Management", 11, 90.5),
	            new Employee(5, "alice2@example.com", "Alice", "Johnson", "CS", 105, "Physics", 13, 93.0)
	        );
		return employees;
	}

}
