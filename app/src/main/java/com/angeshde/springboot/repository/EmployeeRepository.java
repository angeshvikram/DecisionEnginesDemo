package com.angeshde.springboot.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.angeshde.springboot.model.*;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

	Optional<Employee> findById(String id);


}
