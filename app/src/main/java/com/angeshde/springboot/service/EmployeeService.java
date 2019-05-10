package com.angeshde.springboot.service;

import java.util.Optional;

import com.angeshde.springboot.model.*;

public interface EmployeeService {

	public Iterable<Employee> findAll();

	public Employee save(Employee employee);

	public Optional<Employee> findByID(String id);
	public void removeStudent(String id);

}
