package com.lcc.adapter;

public class AdapterClient {
    public static void main(String[] args) {
        ITarget adapter = new Adapter();
        adapter.request();

        ITarget target = new ConcreteTarget();
        target.request();
    }
}
