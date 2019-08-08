package com.aev.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import com.aev.springframework.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
