package com.spring.web.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring.web.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
