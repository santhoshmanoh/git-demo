package com.spring.jdbc.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.mapper.EmployeeRowMapper;
import com.spring.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public Employee findById(int employeeId) {

		Employee employee = (Employee) getTemplate().queryForObject("SELECT * FROM Employee_tbl WHERE EMPLOYEE_ID=?", new Object[] { employeeId }, new EmployeeRowMapper());		
		return employee;
	}

	public Collection<Employee> findAll() {

		List<Employee> employeeslist = getTemplate().query("SELECT * FROM Employee_tbl", new EmployeeRowMapper());
		return employeeslist;
	}
}