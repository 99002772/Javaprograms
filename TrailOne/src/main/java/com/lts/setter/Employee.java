package com.lts.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Employee {
	String name;
	Integer empId;
	String department;
	@Autowired
	Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public String getName() {
		return name;
	}
	@Value("${employee.name}")
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmpId() {
		return empId;
	}
	@Value("${employee.empId}")
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getDepartment() {
		return department;
	}
	@Value("${employee.department}")
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", department=" + department + ", address=" + address
				+ "]";
	}
	

}
