package com.project.service;

import java.util.List;


import com.project.model.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student getStudentById(Long id);

	Student createStudent(String fistName,String lastName);

	void deleteStudent(Long id);

	Student updateStudent( Long id, Student student);

}
