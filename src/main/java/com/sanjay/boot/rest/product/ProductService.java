package com.sanjay.boot.rest.product;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjay.boot.rest.employee.EmployeeService;

@Service
public class ProductService {
	
	@Autowired
	EmployeeService employeeService;
	

	private List<Product> products = Arrays.asList(
			new Product(1,"Apple","KashmirApple"),
			new Product(2,"Orange","SwedenOrange"),
			new Product(3,"Banana","MysoreBanana")
			);
	
	
	 public List<Product> getAllProducts() {
		 return products;
	 }
	 
	 public List getEmployeeDetails() {
		 return employeeService.getEmployeeDetails();
	 }
	 
	 public Product getProduct(int id) {		 
		return  products.stream().filter(product -> product.getId() == id).findFirst().get();
	 }
	
}
