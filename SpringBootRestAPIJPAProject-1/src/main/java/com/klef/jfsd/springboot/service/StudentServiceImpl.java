package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository repository;

	@Override
	public String addStudent(Student s) {
		// TODO Auto-generated method stub
		repository.save(s);
		return "Student Added Successfully";
	}

	@Override
	public String updateStudent(Student s) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public String deleteStudent(int sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student viewStudentbyid(int sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> viewallstudents() {
		// TODO Auto-generated method stub
		
		return (List<Student>) repository.findAll();
	}

}
