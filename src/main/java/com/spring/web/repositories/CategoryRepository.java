package com.spring.web.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.spring.web.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

	public Optional<Category> findByDescription(String description);
}
