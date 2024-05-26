package com.example.SparkYourCafe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SparkYourCafe.Entity.Products;
import com.example.SparkYourCafe.dao.ProductsDao;


@Service
public class ProductsService {

	@Autowired
    private ProductsDao productsDao;

    public Products createProduct(Products product) {
        return productsDao.create(product);
    }

    public List<Products> getAllProducts() {
        return productsDao.getAll();
    }

    public Products getProductById(long productId) {
        return productsDao.getById(productId);
    }

    public Products updateProduct(long productId, Products product) {
        return productsDao.update(productId, product);
    }

    public void deleteProduct(long productId) {
        productsDao.delete(productId);
    }

    public List<Products> getProductsByCategory(long categoryId) {
        return productsDao.getByCategory(categoryId);
    }

    public List<Products> searchProductsByName(String name) {
        return productsDao.searchByName(name);
    }

    public List<Products> searchProductsByPrice(double price) {
        return productsDao.searchByPrice(price);
    }

}
