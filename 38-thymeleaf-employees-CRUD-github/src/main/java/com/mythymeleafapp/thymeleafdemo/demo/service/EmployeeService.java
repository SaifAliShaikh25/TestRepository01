package com.mythymeleafapp.thymeleafdemo.demo.service;

import java.util.List;

import com.mythymeleafapp.thymeleafdemo.demo.entity.Employee;

public interface EmployeeService {
	
	//add methods which are there in DAO
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	

}
