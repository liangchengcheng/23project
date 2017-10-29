package com.lcc.factory.impl;

import com.lcc.factory.IUserDao;

public interface IDaoFactory {
    IUserDao createUserDao();
}
