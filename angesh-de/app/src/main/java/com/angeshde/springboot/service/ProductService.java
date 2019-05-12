package com.angeshde.springboot.service;

import java.util.Optional;

import com.angeshde.springboot.model.*;

public interface ProductService {

	public Iterable<Product> findAll();

	public Product save(Product product);

	public Optional<Product> findByID(String id);
	public void removeProduct(String id);

}
