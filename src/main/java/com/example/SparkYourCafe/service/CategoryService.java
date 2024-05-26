package com.example.SparkYourCafe.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.SparkYourCafe.Entity.Category;
import com.example.SparkYourCafe.dao.CategoryDao;

import java.util.List;


@Service
public class CategoryService {

	@Autowired
	private CategoryDao categoryDao;
	
	public Category createCategory(Category category) {
		
		return categoryDao.createCategory(category);
	}

	@Transactional(readOnly = true)
    public List<Category> getAllCategories() {
        return categoryDao.getAllCategories();
    }

	public Category getCategoryById(long categoryId) {
		// TODO Auto-generated method stub
		return categoryDao.getCategoryById(categoryId);
	}

	public Category updateCategory(long categoryId, Category category) {
		return categoryDao.updateCategory(categoryId, category);
    
	}

	public void deleteCategory(long categoryId) {
		 categoryDao.deleteCategory(categoryId);
		
	}
	
	@Transactional(readOnly = true)
    public List<Category> searchCategoriesByName(String categoryName) {
        return categoryDao.searchCategoriesByName(categoryName);
    }

}
