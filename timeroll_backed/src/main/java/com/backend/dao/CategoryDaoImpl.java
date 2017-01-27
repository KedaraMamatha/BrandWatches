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
	public boolean addCategory(CategoryModel category)
	{
		logger.info("------------started------------------");
		Session session=sessionFactory.getCurrentSession();
		Integer i=(Integer) session.save(category);
		System.out.println("category saved");
		if (i!=0)
		{
			logger.info("------------------ended--------------");
			return true;
		}
		else
		{
			return false;
		}
	}

}
