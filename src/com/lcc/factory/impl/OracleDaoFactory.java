package com.lcc.factory.impl;

import com.lcc.factory.IUserDao;
import com.lcc.factory.MySQLUserDao;

public class OracleDaoFactory implements IDaoFactory {

    @Override
    public IUserDao createUserDao() {
        return new MySQLUserDao();
    }
}
