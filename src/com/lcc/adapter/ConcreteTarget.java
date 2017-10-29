package com.lcc.adapter;

public class ConcreteTarget implements ITarget {

    @Override
    public void request() {
        System.out.print("ConcreteTarget.request()");
    }
}
