package com.lcc.single;

public class Singleton0 {

    //静态不可变
    private static final Singleton0 singleton = new Singleton0();

    private Singleton0(){

    }

    public static Singleton0 getInstance(){
        return singleton;
    }
}
