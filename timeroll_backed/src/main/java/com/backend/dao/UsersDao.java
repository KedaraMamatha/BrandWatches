package com.backend.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;


import com.backend.model.UsersModel;


@ComponentScan("com")
@Repository
public interface UsersDao {
	
public boolean registerUser(UsersModel user);

}
