package com.backend.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.backend.model.SupplierModel;

@ComponentScan("com")
@Repository
public interface SupplierDao {

	public boolean addSupplier(SupplierModel supplier);
	
}
