package com.aev.springframework.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.aev.springframework.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	
	Optional<Category> findByDescription(String description);

}
