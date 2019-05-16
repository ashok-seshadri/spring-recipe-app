package com.spring.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.web.service.RecipeServiceImpl;

@Controller
public class IndexController {

	private RecipeServiceImpl recipeServiceImpl;
	
	
	public IndexController(RecipeServiceImpl recipeServiceImpl) {
		super();
		this.recipeServiceImpl = recipeServiceImpl;
	}


	@GetMapping({"","/","/index"})
	public String getIndexPage(Model model) {		
		model.addAttribute("recipes", recipeServiceImpl.getRecipes());
		return "index";
	}
}
