package com.angeshde.springboot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.angeshde.springboot.model.*;
import com.angeshde.springboot.repository.*;

@RestController
public class EmployeeController {
	
	@Autowired
	 EmployeeRepository employeeRepository;
	     
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public Iterable<Employee> employee() {
		return employeeRepository.findAll();
	}
	@RequestMapping(value = "/student", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee create(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	@RequestMapping(method=RequestMethod.GET, value = "/{id}")
	public Optional<Employee> read(@PathVariable String id) {
		return employeeRepository.findById(id);
	}
	
}
