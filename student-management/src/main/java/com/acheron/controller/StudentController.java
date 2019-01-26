package com.acheron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acheron.interfaces.StudentRepo;
import com.acheron.repo.Student;

@RestController
public class StudentController {
	@Autowired
	private StudentRepo studentRepo;

	@GetMapping("/geAllStudent")
	public List<Student> getStudentDetails() {
		return studentRepo.findAll();
	}
}
