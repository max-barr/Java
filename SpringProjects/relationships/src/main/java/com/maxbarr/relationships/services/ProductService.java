package com.maxbarr.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.maxbarr.relationships.models.Category;
import com.maxbarr.relationships.models.Product;
import com.maxbarr.relationships.repositories.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public List<Product> allProducts() {
		return productRepository.findAll();
	}
	
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Product findProduct(Long id) {
		Optional<Product> optionalProduct = productRepository.findById(id);
		if(optionalProduct.isPresent()) {
			return optionalProduct.get();
		} else {
			return null;
		}
	}
	
	public List<Category> findCategories(Product product) {
		return product.getCategories();
	}
	
	public List<Product> findByCategories(Category category) {
		System.out.println("Product Service / Find by Categories");
		return productRepository.findAllByCategories(category);
	}
	
	public List<Product> findByCategoriesNotInProduct(Category category) {
		System.out.println("Product Service / Find by Categories Not in Product");
		return productRepository.findByCategoriesNotContains(category);
	}
	
}
