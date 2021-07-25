package com.ihs2code.cruddm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ihs2code.cruddm.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// no need to write additional code for CRUD
}
