package com.java.training;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("Abi","Erode",101);
		Employee employee2 = new Employee("Ramu","coimbatore",102);
		Employee employee3 = new Employee("Chandru","Chennai",103);
		Employee employee4 = new Employee("Ganga","Ooty",104);
		
		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		
		for (Employee emp : employeeList) {
			System.out.println(emp);
			
		}
		
		Collections.sort(employeeList);
		System.out.println("sorted list using comparable");
		for (Employee emp : employeeList) {
			System.out.println(emp);
			
		}


	}

}
