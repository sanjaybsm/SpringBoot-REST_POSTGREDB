package com.sanjay.boot.rest.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;

	
	@RequestMapping("/product")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();		
		
	}
	
	
	
	
	@RequestMapping("/product/{id}")
	public Product getProduct(@PathVariable int id) {
		return productService.getProduct(id);
	}
	
	

}
