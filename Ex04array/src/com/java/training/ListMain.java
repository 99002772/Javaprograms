package com.java.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListMain {
	public static void main(String[] args)
	{
		List<Employee> employeeList=new ArrayList<>();	
		Employee employee1 = new Employee("Preethika","Namakkal",40000.0);
		employeeList.add(employee1);
		employeeList.add(new Employee("Abi","Erode",80000.0));
		employeeList.add(new Employee("Ramu","coimbatore",60000.0));
		employeeList.add(new Employee("Chandru","Chennai",80000.0));
		employeeList.add(new Employee("Ganga","Ooty",70000.0));
		
		System.out.println(employeeList);
		//Line by line
		Iterator<Employee> it=employeeList.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp);
		}
		
		for(Employee emp1:employeeList) {
			System.out.println(emp1);
		}
		System.out.println("//////////REVERSE ORDER/////////////////");
		ListIterator<Employee> listIt=employeeList.listIterator(employeeList.size());
		while (listIt.hasPrevious()) {
			Employee employee = listIt.previous();
			System.out.println(employee);
			
		}

	}
}
