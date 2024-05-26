package com.example.SparkYourCafe.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SparkYourCafe.Entity.Products;

@Repository
public class ProductsDao {

	
	@Autowired
    private SessionFactory sessionFactory;

    public Products create(Products product) {
    	sessionFactory.getCurrentSession().save(product);
        return product;
    }

    public List<Products> getAll() {
        return sessionFactory.getCurrentSession().createCriteria(Products.class).list();
    }

    public Products getById(long productId) {
        return sessionFactory.getCurrentSession().get(Products.class, productId);
    }

    public Products update(long productId, Products product) {
    	Products existingProduct = getById(productId);
        if (existingProduct != null) {
            existingProduct.setProductName(product.getProductName());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setCategoryId(product.getCategoryId());
            sessionFactory.getCurrentSession().update(existingProduct);
        }
        return existingProduct;
    }

    public void delete(long productId) {
    	Products product = getById(productId);
        if (product != null) {
        	sessionFactory.getCurrentSession().delete(product);
        }
    }

    public List<Products> getByCategory(long categoryId) {
        return sessionFactory.getCurrentSession()
                .createCriteria(Products.class)
                .createAlias("category", "c")
                .add(Restrictions.eq("c.categoryId", categoryId))
                .list();
    }

    public List<Products> searchByName(String name) {
        return sessionFactory.getCurrentSession()
                .createCriteria(Products.class)
                .add(Restrictions.ilike("name", "%" + name + "%"))
                .list();
    }

    public List<Products> searchByPrice(double price) {
        return sessionFactory.getCurrentSession()
                .createCriteria(Products.class)
                .add(Restrictions.eq("price", price))
                .list();
    }

    
}
