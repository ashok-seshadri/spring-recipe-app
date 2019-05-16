package com.spring.web.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.spring.web.domain.Recipe;
import com.spring.web.repositories.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {

	private RecipeRepository recipeRepository;
	
	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}
	
	@Override
	public Set<Recipe> getRecipes() {
		Set<Recipe> recipes = new HashSet<>();
		recipeRepository.findAll().iterator().forEachRemaining(recipes :: add);
		return recipes;
	}

}
