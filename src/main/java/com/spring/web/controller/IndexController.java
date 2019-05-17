package com.spring.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.web.service.RecipeService;

@Controller
public class IndexController {

	private RecipeService recipeService;
	
	
	public IndexController(RecipeService recipeService) {
		super();
		this.recipeService = recipeService;
	}


	@GetMapping({"","/","/index"})
	public String getIndexPage(Model model) {		
		model.addAttribute("recipes", recipeService.getRecipes());
		return "index";
	}
}
