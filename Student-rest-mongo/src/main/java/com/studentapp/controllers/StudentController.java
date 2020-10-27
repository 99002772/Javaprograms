package com.studentapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.studentapp.exceptions.StudentNotFoundException;
import com.studentapp.model.Student;
import com.studentapp.service.StudentService;

@RestController
@RequestMapping ("/student-api")

public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/student")
	Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@DeleteMapping("/student/delete-one/{id}")
	boolean deleteStudent(@PathVariable("id") int id)throws StudentNotFoundException {
		return studentService.deleteStudent(id);
	}
		
	@GetMapping("/student/get-one/{id}")
	Student getStudentById(@PathVariable("id")int id) throws StudentNotFoundException {
		return studentService.getStudentById(id);
	}

}
