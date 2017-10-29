package com.lcc.factory;

public interface IUserDao {
    void addUser(User user);
    void removeUser(User user);
    User getUser(String username);
}
