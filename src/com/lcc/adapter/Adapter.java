package com.lcc.adapter;

public class Adapter implements ITarget {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        System.out.print("Adapter.request");
        adaptee.onRequest();
    }
}
