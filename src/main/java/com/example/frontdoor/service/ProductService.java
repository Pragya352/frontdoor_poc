package com.example.frontdoor.service;

import java.util.List;

import com.example.frontdoor.domain.Product;

public interface ProductService {

	Product saveProduct(Product product);

	List<Product> getProducts();

	Product getProductById(int id);

	String deleteProduct(int id);

	Product updateProduct(Product product);

}
