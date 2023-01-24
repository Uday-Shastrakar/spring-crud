package com.project.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.ResourceClosedException;
import org.springframework.stereotype.Service;

import com.project.exception.ResourceNotFoundException;
import com.project.model.Student;
import com.project.repository.StudentRepository;
import com.project.service.StudentService;
@Service
public class SutdentServiceImpl implements StudentService{
	
	
	
	public SutdentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		return studentRepository.findAll();
		
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		Optional<Student> result =studentRepository.findById(id);
		if(result.isPresent()) {
		return result.get();
		}else {
			throw new ResourceNotFoundException("Student","id", id);
		}
		
	}

	@Override
	public Student createStudent(String firstName,String lastName) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.setFirstName(firstName);
		stu.setLastName(lastName);
		return studentRepository.save(stu);
	}

	@Override
	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		Student student = studentRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Student","id",id));
		studentRepository.delete(student);
	}




	

}
