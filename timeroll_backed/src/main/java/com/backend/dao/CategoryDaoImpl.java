package com.backend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.backend.model.CategoryModel;

@Repository("CategoryDaoImpl")
@Transactional

public class CategoryDaoImpl  implements CategoryDao{
	@Autowired
	private SessionFactory sessionFactory;
	private static final Logger logger=LoggerFactory.getLogger(CategoryDaoImpl.class);
	public void addCategory(CategoryModel category)
	{
		logger.info("------------started------------------");
		Session session=sessionFactory.getCurrentSession();
		session.save(category);
		System.out.println("category saved");
		logger.info("------------------ended--------------");
	}

}
