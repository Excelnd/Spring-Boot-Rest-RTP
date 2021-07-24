package com.ihs2code.cruddm.dao;

import java.util.List;

import com.ihs2code.cruddm.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
