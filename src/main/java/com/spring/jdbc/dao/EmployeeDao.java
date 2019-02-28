package com.spring.jdbc.dao;

import java.util.Collection;

import com.spring.model.Employee;

public interface EmployeeDao {

	public Employee findById(int employeeId);
	
	public Collection<Employee> findAll();
}