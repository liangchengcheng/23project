package com.lcc.factory;

public class PostgreSQLUserDao implements IUserDao {

    @Override
    public void addUser(User user) {
        System.out.print("PostgreSQL added User {} "+user);
    }

    @Override
    public void removeUser(User user) {
        System.out.print("PostgreSQL removed User {} "+user);
    }

    @Override
    public User getUser(String username) {
        User user = new User();
        user.setUsername(username);
        return user;
    }

}
