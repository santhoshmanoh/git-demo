package com.spring.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getInt("EMPLOYEE_ID"));
		emp.setName(rs.getString("EMPLOYEE_FULLNAME"));
		emp.setDesignation(rs.getString("EMPLOYEE_DESIGNATION"));
		emp.setSalary(rs.getInt("EMPLOYEE_SALARY"));

		return emp;
	}
}