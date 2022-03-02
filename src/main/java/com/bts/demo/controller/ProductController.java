package com.bts.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bts.demo.models.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {

	private final ProductRepository ProductRepository;

	public ProductController(ProductRepository productRepository) {
		ProductRepository = productRepository;
	}
	
	@GetMapping
	public ResponseEntity getallProducts() {
		return ResponseEntity.ok(this.ProductRepository.findAll());
	}
	
	
}
