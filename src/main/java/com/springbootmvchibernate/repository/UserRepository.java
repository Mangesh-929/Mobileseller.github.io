package com.springbootmvchibernate.repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootmvchibernate.pojo.User;

public interface UserRepository extends CrudRepository<User,String>{
	

}
