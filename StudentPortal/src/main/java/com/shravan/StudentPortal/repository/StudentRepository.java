package com.shravan.StudentPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shravan.StudentPortal.modal.Students;

public interface StudentRepository  extends JpaRepository<Students, Integer>{
	
	Students findByName(String s);


}
