package com.aev.springframework.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CategoryTest {

	Category category;

	@Before
	public void setUp() {
		category = new Category();
	}

	@Test
	public void testGetId() {
		Long idValue = 4L;

		category.setId(idValue);
		
		assertEquals(idValue, category.getId());
	}

	@Test
	public void testGetDescription() {
		String descValue = "description";
		
		category.setDescription(descValue);
		
		assertEquals(descValue, category.getDescription());
	}

	@Test
	public void testGetRecipes() {		
	}

}
