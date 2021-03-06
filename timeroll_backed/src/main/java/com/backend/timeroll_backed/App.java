package com.backend.timeroll_backed;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.configuration.ApplicationConfig;



import com.backend.dao.ProductDao;
import com.backend.dao.UsersDao;
import com.backend.dao.CategoryDao;
import com.backend.dao.SupplierDao;
import com.backend.model.CategoryModel;
import com.backend.model.ProductModel;
import com.backend.model.SupplierModel;
import com.backend.model.UsersModel;


public class App 
{
    public static void main( String[] args )
    {
       
AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
//annotationConfigApplicationContext.refresh();
annotationConfigApplicationContext.close();
UsersDao userDao=(UsersDao)annotationConfigApplicationContext.getBean("UserDaoImpl");
UsersModel user=new UsersModel();
user.setFirstName("Kedara");
user.setLastName("Mamatha");
user.setPassword("12345");
user.setConformPassword("12345");
user.setEmailId("kmamatha1968@gmail.com");
userDao.registerUser(user);

ProductDao productDao=(ProductDao)annotationConfigApplicationContext.getBean("ProductDaoImpl");
ProductModel product=new ProductModel();
product.setProductName("watches");
product.setPrice(5000);
productDao.addProduct(product);


CategoryDao categoryDao=(CategoryDao) annotationConfigApplicationContext.getBean("CategoryDaoImpl");
CategoryModel category=new CategoryModel();
category.setCategoryName("Professional");
categoryDao.addCategory(category);


SupplierDao supplierDao=(SupplierDao) annotationConfigApplicationContext.getBean("SupplierDaoImpl");
SupplierModel supplier=new SupplierModel();
supplier.setSupplierName("Fossil");
supplier.setSupplierAddress("Mumbai");
supplierDao.addSupplier(supplier);

}

}
