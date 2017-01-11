package com.backend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.backend.model.SupplierModel;

@Repository("SupplierDaoImpl")
@Transactional
public class SupplierDaoImpl implements SupplierDao{

	@Autowired
	private SessionFactory sessionFactory;
	public void addSupplier(SupplierModel supplier) {
		
		Session session=sessionFactory.getCurrentSession();
		session.save(supplier);
		System.out.println("supplier saved");
		
	}


}
