package com.mythymeleafapp.thymeleafdemo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mythymeleafapp.thymeleafdemo.demo.dao.EmployeeRepository;
import com.mythymeleafapp.thymeleafdemo.demo.entity.Employee;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImplementation(EmployeeRepository theEmployeeRepository)
	{
		employeeRepository = theEmployeeRepository;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		
		//return employeeRepository.findAll();
		return employeeRepository.findAllByOrderByLastNameAsc();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		
		Optional<Employee> result = employeeRepository.findById(theId);
		Employee employee = null;
		if(result.isPresent())
			employee = result.get();
		else
			throw new RuntimeException("Employee with id "+theId+"  not found");
		return employee;
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		
		employeeRepository.save(theEmployee);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		
		employeeRepository.deleteById(theId);
	}

}
