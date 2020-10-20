package com.java.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("Abi","Erode",101);
		Employee employee2 = new Employee("Ramu","Coimbatore",103);
		Employee employee3 = new Employee("Chandru","Chennai",102);
		Employee employee4 = new Employee("Ganga","Ooty",104);
		Employee employee5 = new Employee("Preethika","Namakkal",105);
		
		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		
		for (Employee emp : employeeList) {
			System.out.println(emp);
		}
		
		//sort using comparator
		Collections.sort(employeeList, new NameSort());
		System.out.println("/////////Sorted by name///////////");
		for (Employee emp : employeeList) {
			System.out.println(emp);
		}
		
		Collections.sort(employeeList, new Comparator<Employee>() {

			@Override
			public int compare(Employee employ1, Employee employ2) {
				// TODO Auto-generated method stub
				return employ1.getCity().compareTo(employ2.getCity());
			}
			
		});
		System.out.println("/////////Sorted by city///////////");
		for (Employee emp : employeeList) {
			System.out.println(emp);
		}
		
		Collections.sort(employeeList,(emp1,emp2)->{
			return emp1.getEmpId().compareTo(emp2.getEmpId());
			
		});
		
		System.out.println("/////////Sorted by Employee ID///////////");
		for (Employee emp : employeeList) {
			System.out.println(emp);
		}
		

	}

}
