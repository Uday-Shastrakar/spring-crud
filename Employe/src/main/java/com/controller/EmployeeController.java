package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.service.EmployeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
private EmployeService employeeService;

public EmployeeController(EmployeService employeeService) {
	super();
	this.employeeService = employeeService;
}
@PostMapping("/post")
public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
	return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	
}


}
