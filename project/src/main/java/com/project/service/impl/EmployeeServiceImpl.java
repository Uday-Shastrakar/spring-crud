package com.project.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.model.Employe;
import com.project.repository.EmployeRepository;
import com.project.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
   
	EmployeRepository employeRepository;
	
	public EmployeeServiceImpl(EmployeRepository employeRepository) {
		super();
		this.employeRepository = employeRepository;
	}
// find all employee
	@Override
	public List<Employe> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employe> employes = new ArrayList<Employe>();
		employeRepository.findAll().forEach(employe -> employes.add(employe));
		return employes ;
	}
//   find  employee by id 
	@Override
	public Optional<Employe> getEmployeById(Long id) {
		// TODO Auto-generated method stub
		
		return employeRepository.findById(id);
	}
// save Employee data 
	@Override
	public Employe saveEmploye(Employe employe) {
		// TODO Auto-generated method stub
    	return	employeRepository.save(employe);
	}
// delete employee data 
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		employeRepository.deleteById(id);
	}
//update employee data 
	@Override
	public void update(Employe employe, Long id) {
		// TODO Auto-generated method stub
		employeRepository.save(employe);
		
	}

}
