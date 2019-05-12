package com.angeshde.springboot.controller;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.angeshde.springboot.model.*;
import com.angeshde.springboot.repository.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@CrossOrigin
@RestController
public class ProductController {

	private final Logger logger = Logger.getLogger(this.getClass().getName());

	@Autowired
	ProductRepository productRepository;

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public Iterable<Product> employee() {
		logger.log(Level.INFO, "Info: " + " RequestMethod.Get");
		return productRepository.findAll();
	}
	@RequestMapping(value = "/products", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Product create(@RequestBody Product product) {
		logger.log(Level.INFO, "Info: " + " RequestMethod.POST");
		return productRepository.save(product);
	}

	@ExceptionHandler(NoSuchElementException.class)
	public HttpStatus handleNotFoundResource() {
	    return HttpStatus.NOT_FOUND;
	}

	@RequestMapping(method=RequestMethod.GET, value = "products/{id}")
	public ResponseEntity<Product> read(@PathVariable String id) {
		Optional<Product> optional = productRepository.findById(id);
		Product someProduct = optional.get();
		if(optional.isPresent()) {
			return new ResponseEntity<Product>(someProduct, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
