package com.yuanziren.service;

import com.yuanziren.dao.UserDao;

public class AccountService {


    private UserDao userDao;

    public AccountService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void addUser(){
        userDao.add();
    }

}