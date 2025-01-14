package com.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {	
}
