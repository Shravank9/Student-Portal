package com.shravan.StudentPortal.service;

import java.util.List;

import com.shravan.StudentPortal.modal.Students;

public interface Studentservice {

	public abstract Students CreateStudent(Students s);

	public abstract List<Students> getAllStudents();

	public abstract Students getStudentById(int id);

	public abstract Students updateStudent(int id, Students s);

	public abstract void deleteStudent(int sid);
	
	public abstract Students getstudentByName(String s);



}
