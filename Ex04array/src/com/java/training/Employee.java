package com.java.training;

public class Employee {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	
	private String name;
	private String city;
	private Double salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String name, String city, Double salary) {
		super();
		this.name = name;
		this.city = city;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	
	
	

}
