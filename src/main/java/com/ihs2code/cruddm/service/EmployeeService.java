package com.ihs2code.cruddm.service;

import java.util.List;

import com.ihs2code.cruddm.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
}
