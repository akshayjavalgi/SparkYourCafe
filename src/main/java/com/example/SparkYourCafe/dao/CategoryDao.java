package com.example.SparkYourCafe.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SparkYourCafe.Entity.Category;

import java.util.List;

@Repository
public class CategoryDao {
	
	 @Autowired
	    private SessionFactory sessionFactory;


	public Category createCategory(Category category) {
		 sessionFactory.getCurrentSession().save(category);
	        return category;
	}

	@SuppressWarnings("unchecked")
	public List<Category> getAllCategories() {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(Category.class);
        return criteria.list();
}

	public Category getCategoryById(long categoryId) {
        return sessionFactory.getCurrentSession().get(Category.class, categoryId);
    }

	public Category updateCategory(long categoryId, Category category) {
		Session session = sessionFactory.getCurrentSession();
        Category existingCategory = session.get(Category.class, categoryId);
        if (existingCategory != null) {
            existingCategory.setCategoryName(category.getCategoryName());
            existingCategory.setDescription(category.getDescription());
            session.update(existingCategory);
        }
        return existingCategory;
	}
	
	public void deleteCategory(long categoryId) {
        Session session = sessionFactory.getCurrentSession();
        Category category = session.get(Category.class, categoryId);
        if (category != null) {
            session.delete(category);
        }
    }
	
	 @SuppressWarnings("unchecked")
	    public List<Category> searchCategoriesByName(String categoryName) {
	        Session session = sessionFactory.getCurrentSession();
	        Criteria criteria = session.createCriteria(Category.class);
	        criteria.add(Restrictions.ilike("categoryName", categoryName, MatchMode.ANYWHERE));
	        return criteria.list();
	    }
}
