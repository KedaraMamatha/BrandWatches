package com.backend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.backend.model.SupplierModel;

@Repository("SupplierDaoImpl")
@Transactional
public class SupplierDaoImpl implements SupplierDao{

	@Autowired
	private SessionFactory sessionFactory;
	private static final Logger logger=LoggerFactory.getLogger(SupplierDaoImpl.class);
	public void addSupplier(SupplierModel supplier) {
		
		logger.info("-------------------started-------------------");
		Session session=sessionFactory.getCurrentSession();
		session.save(supplier);
		System.out.println("supplier saved");
		logger.info("---------------------ended------------------------");
		
	}


}
