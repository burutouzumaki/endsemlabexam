package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String home() {
		return "Spring Boot Rest API Object";
	}
	
	@PostMapping("add")
	public String addStudent(@RequestBody Student s)
	{
		return service.addStudent(s);
	}
	
	@GetMapping("viewall")
	public List<Student> viewallStudents()
	{
		return service.viewallstudents();
	}
	

}
