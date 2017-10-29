package com.lcc.single;

public class Singleton1_1 {
    private static Singleton1_1 singleton1_1 = null;

    private Singleton1_1() {

    }

    public synchronized static Singleton1_1 getInstance() {
        if (singleton1_1 == null) {
            singleton1_1 = new Singleton1_1();
        }
        return singleton1_1;
    }
}
