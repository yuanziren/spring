package com.yuanziren.service;


import com.yuanziren.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

//    private UserDao userDao = new UserDao();

    @Autowired
    private UserDao userDao;

    public void addUser(){
        userDao.add();
    }


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}