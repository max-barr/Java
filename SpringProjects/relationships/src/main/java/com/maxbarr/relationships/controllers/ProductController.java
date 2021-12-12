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
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/products/new")
	public String index(@ModelAttribute("product") Product product, Model model) {
		List<Product> products = productService.allProducts();
		model.addAttribute("products", products);
		return "relationships/product.jsp";
	}
	
	@PostMapping("/products/new")
	public String create(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "relationships/product.jsp";
		} else {
			productService.createProduct(product);
			return "redirect:/products/new";
		}
	}
	
	@RequestMapping(value="/products/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		Product product = productService.findProduct(id);
		model.addAttribute("product", product);
		
		model.addAttribute("categoriesIn", categoryService.findByProducts(product));
		model.addAttribute("categoriesOut", categoryService.findByProductsNotInCategory(product));
		return "/relationships/showProduct.jsp";
	}
	
	@PostMapping(value="/products/{id}/add")
	public String add(@PathVariable("id") Long productId, @RequestParam("category_id") Long categoryId) {
		Product product = productService.findProduct(productId);
		Category category = categoryService.findCategory(categoryId);
		
		List<Category> categoryList = product.getCategories();
		categoryList.add(category);
		
		productService.saveProduct(product);
		return "redirect:/products/new";
	}
	

}
