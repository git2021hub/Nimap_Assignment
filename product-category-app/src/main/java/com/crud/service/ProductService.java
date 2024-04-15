package com.crud.service;

import java.util.List;

import com.crud.model.Product;

public interface ProductService {
	
	//save of create 
	public Product saveProduct(Product product);

	// Read All
	public List<Product> fetchAllProduct();
	
	// Read by ID
	public Product fetchProductById(long id);
	
	//update product
	public Product updateProduct(Product product,long id);
	
	//delete product
	public void deleteProduct(long id);
}
