package com.ihs2code.cruddm.rest;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihs2code.cruddm.dao.EmployeeDAO;
import com.ihs2code.cruddm.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeDAO employeeDAO;
	
	// inject employee dao by constructor
	public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}
	
	// expose "/employees" and return lsit of employees
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}
	
}
