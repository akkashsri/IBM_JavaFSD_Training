package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.model.ProductEntity;
import com.example.demo.repository.ProductRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
	
	private final ProductRepository productRepository;

	@Override
	public ProductEntity createProduct(ProductEntity productEntity) {
		
		return productRepository.save(productEntity);
	}

	@Override
	public Iterable<ProductEntity> getAllProducts() {
		
		List<ProductEntity> list = new ArrayList<>();
		productRepository.findAll().forEach(list :: add);;
		
		if(list.isEmpty()) {
			throw new ProductNotFoundException("No such product found...");
		}
		
		return productRepository.findAll();
	}

	@Override
	public ProductEntity getProductById(int id) {
		Optional<ProductEntity> product = productRepository.findById(id);
		if(!product.isPresent()) {
			throw new ProductNotFoundException("Product with id: {" + id + "} not found");
		}
		
		return productRepository.findById(id).get();
	}

	@Override
	public Optional<ProductEntity> getProductByPid(String p_id) {
		Optional<ProductEntity> product = productRepository.findByProductId(p_id);
		if(!product.isPresent()) {
			throw new ProductNotFoundException("Product with PID: {" + p_id + "} not found");
		}
		
		return productRepository.findByProductId(p_id);
	}

	@Override
	public Optional<ProductEntity> getProductByPname(String p_name) {
		Optional<ProductEntity> product = productRepository.findByProductName(p_name);
		if(!product.isPresent()) {
			throw new ProductNotFoundException("Product with name: {" + p_name + "} not found");
		}
		
		return productRepository.findByProductName(p_name);
	}

	@Override
	public ProductEntity updateProductByPid(String p_id, ProductEntity productEntity) {
		Optional<ProductEntity> product = productRepository.findByProductId(p_id);
		if(!product.isPresent()) {
			throw new ProductNotFoundException("Product with PID: {" + p_id + "} not found");
		}
		
		ProductEntity pe = product.get();
		pe.setProductId(productEntity.getProductId());
		pe.setProductName(productEntity.getProductName());
		pe.setProductPrice(productEntity.getProductPrice());
		
		return productRepository.save(pe);
	}

	@Override
	public void deleteProductByPid(String p_id) {
		Optional<ProductEntity> product = productRepository.findByProductId(p_id);
		if(!product.isPresent()) {
			throw new ProductNotFoundException("Product with PID: {" + p_id + "} not found");
		}
		
		productRepository.delete(product.get());

	}

}
