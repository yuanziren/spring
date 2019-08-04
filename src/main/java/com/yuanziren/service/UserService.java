package com.yuanziren.service;


import com.yuanziren.dao.UserDao;

public class UserService {

//    private UserDao userDao = new UserDao();

    private UserDao userDao;

    public void addUser(){
        userDao.add();
    }


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}