package com.cts.product.dao;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductDao {

	Product save(Product product);

	List<Product> findAll();

	Product find(int id);

}