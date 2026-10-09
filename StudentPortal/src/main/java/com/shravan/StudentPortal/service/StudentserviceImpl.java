package com.shravan.StudentPortal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shravan.StudentPortal.modal.Students;
import com.shravan.StudentPortal.repository.StudentRepository;

@Service
public class StudentserviceImpl implements Studentservice {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Students CreateStudent(Students s) {
        return studentRepository.save(s);
    }

    @Override
    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Students getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Students updateStudent(int id, Students s) {
        s.setSid(id);
        return studentRepository.save(s);
    }

    @Override
    public void deleteStudent(int sid) {
        studentRepository.deleteById(sid);
    }

	

	


	@Override
	public Students getstudentByName(String s) {
		return studentRepository.findByName(s);
	}
}