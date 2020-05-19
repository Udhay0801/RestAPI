package com.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.entity.Product;
import com.restapi.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo prodRepo;
	
	public List<Product> getAllProducts()
	{
		return prodRepo.findAll();
	}
	
	public Product getAProductById(Integer productId)
	{
		return prodRepo.findById(productId).isPresent() ? prodRepo.findById(productId).get() : new Product();
	}
}
