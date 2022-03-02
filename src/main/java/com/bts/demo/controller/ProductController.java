package com.bts.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bts.demo.models.entities.Product;
import com.bts.demo.services.ProductService;


@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	
	@GetMapping
	public Iterable<Product> findAll() {
		return productService.findAll();
	}
	
	@GetMapping("/{id}")
	public Product findOne(@PathVariable("id") Long id) {
		return productService.findOne(id);
	}
	
	@GetMapping("/name/{name}")
	public List<Product> findByName(@PathVariable("name") String name) {
		return productService.findByName(name);
	}
	
	@PostMapping
	public Product save(@RequestBody Product product) {
		return productService.save(product);
	}
	
	@PutMapping
	public Product update(@RequestBody Product product) {
		return productService.save(product);
	}
	
	@DeleteMapping("/{id}")
	public void removeOne(@PathVariable("id") Long id) {
		productService.removeOne(id);
	}
	

	
	
}
