package com.mythymeleafapp.thymeleafdemo.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mythymeleafapp.thymeleafdemo.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	//add custom method for sorting by last name
	public List<Employee> findAllByOrderByLastNameAsc();
	
}
