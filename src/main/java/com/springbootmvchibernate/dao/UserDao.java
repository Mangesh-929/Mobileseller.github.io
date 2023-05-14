package com.springbootmvchibernate.dao;

import com.springbootmvchibernate.pojo.User;

public interface UserDao {
        boolean checkUserCredentials(User user);
        boolean addNewUser(User user);
        
}
