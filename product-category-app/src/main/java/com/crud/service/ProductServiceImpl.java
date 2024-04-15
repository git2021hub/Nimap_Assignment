package com.crud.service;

import java.awt.print.Pageable;
import java.util.List;

import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Product;
import com.crud.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> fetchAllProduct() {
		return (List<Product>)productRepository.findAll();
	}

	@Override
	public Product fetchProductById(long id) {
		return productRepository.findById(id).get();
	}

	@Override
	public Product updateProduct(Product product, long id) {
		
		Product oldProduct = new Product();
		oldProduct = productRepository.findById(id).get();
		
		oldProduct.setName(product.getName());
		oldProduct.setPrice(product.getPrice());

		return productRepository.save(oldProduct);
	}

	@Override
	public void deleteProduct(long id) {
		productRepository.deleteById(id);
	}

}
