package com.bts.demo.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bts.demo.models.entities.Product;
import com.bts.demo.models.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product save(Product product) {
		return productRepository.save(product);
	}
	
	public Product findOne(Long id) {
		Optional<Product> product = productRepository.findById(id);
		
		return !product.isPresent()? null : product.get();
		
	}
	
	public Iterable<Product> findAll() {
		return productRepository.findAll();
	}
	
	public void removeOne(Long id) {
		productRepository.deleteById(id);
	}
	
	public List<Product> findByName(String name) {
		return productRepository.findByNameContains(name);
	}
}
