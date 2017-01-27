package com.backend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.backend.model.UserRole;
import com.backend.model.UsersModel;

@Repository("UserDaoImpl")
@Transactional
public class UserDaoImpl implements UsersDao {
	@Autowired
	private SessionFactory sessionFactory;	
	private static final Logger logger=LoggerFactory.getLogger(UserDaoImpl.class);
	public boolean registerUser(UsersModel user) 
	{
		logger.info("----------------------------User Started-------------");
		boolean check =false;
		Session session=sessionFactory.getCurrentSession();
		
		user.setEnabled(true);
		Integer i=(Integer)session.save(user);
		
		    UserRole userRole=new UserRole();
		    userRole.setAuthority("ROLE_USER");
		    userRole.setUserId(user.getUsersId());
		    session.save(userRole);
		    
		if (i!=0)     
		{
			check=true;
		}
		else
		{
			check=false;
		}		
		logger.info("---------------User ended-------------------");	
		return check;
	}
}
