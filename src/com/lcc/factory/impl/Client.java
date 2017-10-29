package com.lcc.factory.impl;

import com.lcc.factory.IUserDao;

public class Client {

    public static void main(String[] args) {
        IDaoFactory factory = new MySQLDaoFactory();
        IUserDao userDao = factory.createUserDao();
        userDao.getUser("admin");

    }
}
