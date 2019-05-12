package com.angeshde.springboot.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.angeshde.springboot.model.*;

public interface ProductRepository extends MongoRepository<Product, String> {

	Optional<Product> findById(String id);


}
