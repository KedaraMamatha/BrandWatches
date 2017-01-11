package com.backend.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.backend.model.ProductModel;

@ComponentScan("com")
@Repository
public interface ProductDao {
	
	public void addProduct(ProductModel product);

}
