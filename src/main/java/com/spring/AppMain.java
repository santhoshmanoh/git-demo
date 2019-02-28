package com.spring;

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.EmployeeDao;
import com.spring.model.Employee;
import org.springframework.stereotype.Controller;

public class AppMain {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-jdbc.xml");

		EmployeeDao employeeDao = (EmployeeDao) ((ClassPathXmlApplicationContext) ac).getBean("employeeDao");

		Employee emp = employeeDao.findById(1);
		System.out.println("-------------Find by Id---------------------");
		System.out.println(emp.toString());

		Collection<Employee> emplist = employeeDao.findAll();
		System.out.println("-------------Find all---------------------");
		for (Employee employee : emplist) {
			System.out.println(employee.toString());
		}

		((AbstractApplicationContext) ac).close();
	}
}