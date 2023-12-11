package com.devblog.estore.ProductsService.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")  // http://localhost:8080/products
public class ProductsController {

	@Autowired
	private Environment env;
	
	@PostMapping
	public String createProduct() {
		return "Product created : HTTP POST handled...";
	}
	
	@GetMapping
	public String findProduct() {
		return "Product Found : HTTP GET"+env.getProperty("local.server.port");
	}
	
	@PutMapping
	public String updateProduct() {
		return "Product created : HTTP PUT";
	}
	
	@DeleteMapping
	public String deleteProduct() {
		return "Product created : HTTP DELETE";
	}
}
