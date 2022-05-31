package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ProductEntity;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {
	
	@Query
	public Optional<ProductEntity> findByProductId(String p_id);
	
	@Query
	public Optional<ProductEntity> findByProductName(String p_name);

}
