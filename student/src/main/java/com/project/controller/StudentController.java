package com.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Student;
import com.project.service.StudentService;


@RestController
@RequestMapping("/api")
public class StudentController {
	
	StudentService studentService;
	
	
	@PostMapping("/stu")
	private ResponseEntity<Student> SaveStudent(@RequestParam String firstname,@RequestParam String lastName){
		
		
		return null;

	
	}

	
	

}
