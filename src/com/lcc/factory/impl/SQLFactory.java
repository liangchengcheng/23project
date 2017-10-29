package com.lcc.factory.impl;

import com.lcc.factory.IUserDao;
import com.lcc.factory.MySQLUserDao;

/**
 * 工厂方法不需要这个
 */
public class SQLFactory  implements IDaoFactory  {

    @Override
    public IUserDao createUserDao() {
        //做一些列的判断
        return new MySQLUserDao();
    }
}
