package com.lcc.factory;

public class OracleUserDao implements IUserDao{

    @Override
    public void addUser(User user) {
        System.out.print("Oracle added User {} "+user);
    }

    @Override
    public void removeUser(User user) {
        System.out.print("Oracle removed User {} "+user);
    }

    @Override
    public User getUser(String username) {
        User user = new User();
        user.setUsername(username);
        return user;
    }
}
