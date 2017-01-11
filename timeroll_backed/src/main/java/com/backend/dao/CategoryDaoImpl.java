package com.backend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.backend.model.CategoryModel;

@Repository("CategoryDaoImpl")
@Transactional
public class CategoryDaoImpl  implements CategoryDao{
	@Autowired
	private SessionFactory sessionFactory;
	public void addCategory(CategoryModel category)
	{
		Session session=sessionFactory.getCurrentSession();
		session.save(category);
		System.out.println("category saved");
	}

}
