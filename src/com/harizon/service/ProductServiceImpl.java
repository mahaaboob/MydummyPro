package com.harizon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harizon.dao.CompanyDAO;
import com.harizon.dao.ProductDAO;

import com.horizon.model.Product;

@Service ("companyService")
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDAO productDao;


	@Override
	public Product createProduct(Product product) {
		
		productDao.create(product);
		return product;
	}
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}
	
}
