package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ErrorResponseModel;
import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.model.ProductEntity;
import com.example.demo.service.ProductService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ProductController {
	
	private final ProductService productService;
	
	@ExceptionHandler
	public ResponseEntity<ErrorResponseModel> handelProductNotFoundException(ProductNotFoundException e) {
		
		ErrorResponseModel responseModel = new ErrorResponseModel();
		responseModel.setErrorMessage(e.getMessage());
		responseModel.setErrorCode(HttpStatus.NOT_FOUND.value());
		responseModel.setErrorRepotingTime(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseModel);
	}
	
	@PostMapping("/products")
	public ResponseEntity<ProductEntity> createOrder(@RequestBody ProductEntity productEntity) {
		
		return new ResponseEntity<ProductEntity>(productService.createProduct(productEntity), HttpStatus.CREATED);
	}
	
	@GetMapping("/products")
	public ResponseEntity<?> getAll() {
		
		return ResponseEntity.ok(productService.getAllProducts());
	}
	
	@GetMapping("/products/id/{id}")
	public ResponseEntity<?> findById(@PathVariable("id")int id) {
		
		return ResponseEntity.ok(productService.getProductById(id));
	}
	
	@GetMapping("/products/pid/{productId}")
	public ResponseEntity<?> findByPid(@PathVariable("productId")String p_id) {
		
		return ResponseEntity.ok(productService.getProductByPid(p_id));
	}
    
	@GetMapping("/products/{productName}")
	public ResponseEntity<?> findByPname(@PathVariable("productName")String p_name) {
		
		return ResponseEntity.ok(productService.getProductByPname(p_name));
	}
	
	@PutMapping("/products/{productId}")
	public ResponseEntity<?> update(@PathVariable("productId")String p_id, @RequestBody ProductEntity productEntity) {
		
		return ResponseEntity.status(HttpStatus.OK).body(productService.updateProductByPid(p_id, productEntity));
	}
	
	@DeleteMapping("/products/{productId}")
	public ResponseEntity<?> delete(@PathVariable("productId")String p_id) {
		
		productService.deleteProductByPid(p_id);
		
		return ResponseEntity.status(HttpStatus.OK).body("Product Deleted successfully...");
	}

}
