package com.aev.springframework.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import com.aev.springframework.services.RecipeServiceImpl;

public class IndexControllerTest {

	@Mock
	RecipeServiceImpl recipeService;

	@Mock
	Model model;

	IndexController indexController;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);

		indexController = new IndexController(recipeService);
	}

	@Test
	public void testGetIndexPage() {
		String viewModel = indexController.getIndexPage(model);

		assertEquals("index", viewModel);
		verify(recipeService, times(1)).getRecipes();
		verify(model, times(1)).addAttribute(eq("recipes"), anySet());
	}

}