package com.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
