package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Category;
import com.crud.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> fetchAllCategories() {
		return (List<Category>) categoryRepository.findAll();
	}

	@Override
	public Category fetchCategoryById(long id) {
		return categoryRepository.findById(id).get();
	}

	@Override
	public Category updateCategory(Category category, long categoryId) {
		
		Category oldcategory = new Category();
		oldcategory = categoryRepository.findById(categoryId).get();
		
		//oldcategory.setCategoryId(category.getCategoryId());
		oldcategory.setName(category.getName());
		
		return categoryRepository.save(oldcategory);
	}

	@Override
	public void deleteCategory(long categoryId) {
		categoryRepository.deleteById(categoryId);
	}

	
}
