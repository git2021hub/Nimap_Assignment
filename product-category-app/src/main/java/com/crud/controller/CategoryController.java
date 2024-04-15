package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Category;
import com.crud.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	//save category REST API
	
	@PostMapping("/add-category")
	public Category saveCategory(@RequestBody Category category) {
		return categoryService.saveCategory(category);
	}
	
	//Read category REST API
	
	@GetMapping("/category/{id}")
	public Category fetchCategoryById(@PathVariable("id") long id) {
		return categoryService.fetchCategoryById(id);
	}
	
	// Read All Categories REST API
	
	@GetMapping("/categories")
	public List<Category> fetchAllCategories(){
		return categoryService.fetchAllCategories();
	}
	
	// update category REST API
	@PutMapping("/category/{id}")
	public Category updateCategory(@RequestBody Category category, @PathVariable("id") long id) {
		return categoryService.updateCategory(category,id);
	}
	
	//delete category REST API
	@DeleteMapping("/category/{id}")
	public String deleteCategory(@PathVariable("id") long id) {
		categoryService.deleteCategory(id);
		return "Deleted Successfully";
	}
}
