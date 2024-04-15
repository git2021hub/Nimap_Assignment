package com.crud.service;

import java.util.List;
import com.crud.model.Category;

public interface CategoryService {
	
	// Create 
	Category saveCategory(Category category);
	
	//Read All
	List<Category> fetchAllCategories();
	
	//Read by id
	Category fetchCategoryById(long id);
	
	//update
	Category updateCategory(Category category,long categoryId);
	
	//delete
	void deleteCategory(long categoryId);
}
