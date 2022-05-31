package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.ProductEntity;

public interface ProductService {
	
	public ProductEntity createProduct(ProductEntity productEntity);
	
	public Iterable<ProductEntity> getAllProducts();
	
	public ProductEntity getProductById(int id);
	
	public Optional<ProductEntity> getProductByPid(String p_id);
	
	public Optional<ProductEntity> getProductByPname(String p_name);
	
	public ProductEntity updateProductByPid(String p_id, ProductEntity productEntity);
	
	public void deleteProductByPid(String p_id);

}
