package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Product;
import com.crud.service.ProductService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class ProductController {

	@Autowired
	private	ProductService productService;
	
	//build add-product REST API
	@PostMapping("/add-product")
	public Product addProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	//build getProductByID REST API
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable("id") long id) {
		return productService.fetchProductById(id);
	}
	
	//build getAllProduct REST API
	@GetMapping("/product")
	public List<Product> getAllProducts(){
		return productService.fetchAllProduct();
	}
	
	@PutMapping("product/{id}")
	public Product updateProduct( @RequestBody Product product,@PathVariable("id") long id) {
		return productService.updateProduct(product, id);
	}
	
	@DeleteMapping("/product/{id}")
	public String deleteProduct(@PathVariable("id") long id) {
		productService.deleteProduct(id);
		return "product deleted successfully";
	}
}
