package com.spring.web.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.spring.web.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
	public Optional<UnitOfMeasure> findByDescription(String description);
}
