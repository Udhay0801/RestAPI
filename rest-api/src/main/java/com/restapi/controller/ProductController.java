package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.entity.Product;
import com.restapi.service.ProductService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@RequestMapping(path = "/getproductdetails", method = RequestMethod.GET)
	public List<Product> getAllProducts()
	{
		return service.getAllProducts();
	}
	
	@RequestMapping(path = "/getproductbyid/{productId}", method = RequestMethod.GET)
	public Product getProductById(@PathVariable("productId") Integer productId)
	{
		return service.getAProductById(productId);
	}
}
