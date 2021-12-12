package com.maxbarr.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maxbarr.relationships.models.Category;
import com.maxbarr.relationships.models.Product;
import com.maxbarr.relationships.services.CategoryService;
import com.maxbarr.relationships.services.ProductService;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/categories/new")
	public String index(@ModelAttribute("category") Category category, Model model) {
		List<Category> categories = categoryService.allCategories();
		model.addAttribute("categories", categories);
		return "relationships/category.jsp";
	}
	
	@PostMapping("/categories/new")
	public String create(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "relationships/category.jsp";
		} else {
			categoryService.createCategory(category);
			return "redirect:/categories/new";
		}
	}
	
	@RequestMapping(value="/categories/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		Category category = categoryService.findCategory(id);
		model.addAttribute("category", category);
		
		model.addAttribute("productsIn", productService.findByCategories(category));
		model.addAttribute("productsOut", productService.findByCategoriesNotInProduct(category));
		return "/relationships/showCategory.jsp";
	}
	
	@PostMapping(value="/categories/{id}/add")
	public String add(@PathVariable("id") Long categoryId, @RequestParam("product_id") Long productId) {
		Product product = productService.findProduct(productId);
		Category category = categoryService.findCategory(categoryId);
		
		List<Product> productList = category.getProducts();
		productList.add(product);
		
		categoryService.saveCategory(category);
		return "redirect:/categories/new";
	}
}
