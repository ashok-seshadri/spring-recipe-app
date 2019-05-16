package com.spring.web.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring.web.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

	
}
