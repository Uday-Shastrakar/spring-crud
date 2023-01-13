package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.model.Employee;
//no need to add repository annotation
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
