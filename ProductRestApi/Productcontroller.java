package com.springweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springweb.Entities.Products;
import com.springweb.repos.ProductRepository;

@RestController
public class Productcontroller {

	@Autowired
	ProductRepository repository;

	@GetMapping(value = "/products/")
	public List<Products> getProducts() {
		return repository.findAll();
	}

	@RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
	public Products getProduct(@PathVariable("id") int id) {
		return repository.findById(id).get();

	}

	@RequestMapping(value = "/products/", method = RequestMethod.POST)
	public Products createProduct(Products product) {
		return repository.save(product);
	}

	@RequestMapping(value = "/products/", method = RequestMethod.PUT)
	public Products updateProduct(Products product) {
		return repository.save(product);
	}

	@RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") int id) {
		repository.deleteById(id);

	}

}
