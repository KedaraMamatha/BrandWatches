package com.backend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.backend.model.UsersModel;

@Repository("UserDaoImpl")
@Transactional
public class UserDaoImpl implements UsersDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void registerUser(UsersModel user) 
	{
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
		System.out.println("user saved");
		
		//private static final Logger logger=LoggerFactory.getLogger(UserDaoImpl.class);
//		logger.info("---------Registered User Model is Implements-------------");
	//logger.info("---------------User Table Created and saved-------------------");	
	}
}
