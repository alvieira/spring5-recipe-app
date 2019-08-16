package com.aev.springframework.services;

import java.util.Set;

import com.aev.springframework.domain.Recipe;

public interface RecipeService {
	
	Set<Recipe> getRecipes();

}
