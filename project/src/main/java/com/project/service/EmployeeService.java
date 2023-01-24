package com.project.service;

import java.util.List;
import java.util.Optional;

import com.project.model.Employe;

public interface EmployeeService {
	
	public List<Employe> getAllEmployee();
	
	public Optional<Employe> getEmployeById(Long id);
	
	public Employe saveEmploye(Employe employe);
	
	public void delete(Long id);
	
	public void update(Employe employe,Long id);

}
