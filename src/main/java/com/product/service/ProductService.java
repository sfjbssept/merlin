package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductService implements IProductService{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public int addProduct(Product product) {
		Product product1 = productRepository.save(product);
		return product1.getId();
	}

}
