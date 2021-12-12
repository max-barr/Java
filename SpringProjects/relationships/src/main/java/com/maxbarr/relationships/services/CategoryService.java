package com.maxbarr.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.maxbarr.relationships.models.Category;
import com.maxbarr.relationships.models.Product;
import com.maxbarr.relationships.repositories.CategoryRepository;

@Service
public class CategoryService {
	private final CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public List<Category> allCategories() {
		return categoryRepository.findAll();
	}
	
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	public Category findCategory(Long id) {
		Optional<Category> optionalCategory = categoryRepository.findById(id);
		if(optionalCategory.isPresent()) {
			return optionalCategory.get();
		} else {
			return null;
		}
	}
	
	public List<Product> findProducts(Category category) {
		return category.getProducts();
	}
	
	
	public List<Category> findByProducts(Product product) {
		return categoryRepository.findAllByProducts(product);
	}
	
	public List<Category> findByProductsNotInCategory(Product product) {
		return categoryRepository.findByProductsNotContains(product);
	}
}
