package com.shravan.StudentPortal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shravan.StudentPortal.modal.Students;
import com.shravan.StudentPortal.service.Studentservice;
import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	Studentservice studentservice;

	@PostMapping("/ss")
	public Students CreateStudent(@RequestBody Students s) {
		return studentservice.CreateStudent(s);

	}

	@GetMapping
	public List<Students> getAllStudents() {
		return studentservice.getAllStudents();
	}

	// Get Student By ID
	@GetMapping("/{id}")
	public Students getStudentById(@PathVariable int id) {
		return studentservice.getStudentById(id);
	}

	// Update Student
	@PutMapping("/{id}")
	public Students updateStudent(@PathVariable int id, @RequestBody Students s) {
		return studentservice.updateStudent(id, s);
	}

	// Delete Student
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id) {
		studentservice.deleteStudent(id);
		return "Student deleted successfully";
	}
	@GetMapping("/name/{name}")
	public Students getstudentName(@PathVariable String name) {
		return studentservice.getstudentByName(name);
		
	}
}
