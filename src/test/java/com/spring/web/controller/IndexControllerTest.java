package com.spring.web.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import com.spring.web.domain.Recipe;
import com.spring.web.service.RecipeService;

public class IndexControllerTest {

	IndexController controller;
	
	@Mock
	RecipeService recipeService;
	
	@Mock
	Model model;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		controller = new IndexController(recipeService);
	}
	@Test
	public void testGetIndexPage() {
		Set<Recipe> recipes = new HashSet<>();
		Recipe recipe1 = new Recipe();
		recipe1.setId(123L);
		
		Recipe recipe2 = new Recipe();
		recipe2.setId(234L);
		
		recipes.add(recipe1);
		recipes.add(recipe2);
		when(recipeService.getRecipes()).thenReturn(recipes);
		String indexPage = controller.getIndexPage(model);
		ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);
		
		assertEquals("index", indexPage);
		
		verify(recipeService, times(1)).getRecipes();
		verify(model, times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());
		
		Set<Recipe> setInController = argumentCaptor.getValue();
		assertEquals(2, setInController.size());

	}

}
