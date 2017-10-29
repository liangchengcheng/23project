package com.lcc.single;

public class Singleton1_2 {

    private static Singleton1_2 singleton1_2 = null;

    private Singleton1_2(){

    }

    public static Singleton1_2 getInstance(){
        if (singleton1_2 == null){
            synchronized (Singleton1_2.class){
                if (singleton1_2 ==null){
                    singleton1_2 = new Singleton1_2();;
                }
            }
        }
        return singleton1_2;
    }
}
