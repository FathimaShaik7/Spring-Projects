package com.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springweb.Entities.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {

}
