package com.lts.constr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	String name;
	Integer StdId;
	String department;
	Course course;
	
	@Autowired
	public Student(Course course) {
		super();
		this.course = course;
	}
	
	public String getName() {
		return name;
	}
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStdId() {
		return StdId;
	}
	@Value("${student.stdId}")
	public void setStdId(Integer stdId) {
		StdId = stdId;
	}
	public String getDepartment() {
		return department;
	}
	@Value("${student.department}")
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", StdId=" + StdId + ", department=" + department + ", course=" + course + "]";
	}
	
	

}
