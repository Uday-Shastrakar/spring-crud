package com.service.impl;

import org.springframework.stereotype.Service;

import com.model.Employee;
import com.repository.EmployeeRepository;
import com.service.EmployeService;
@Service
//no need to add transaction annotation
public class EmployeServiceImpl implements EmployeService{

	private EmployeeRepository employeeRepository;
	
	//no need to add autowire
	public EmployeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}
	
}
