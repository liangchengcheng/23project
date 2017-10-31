package com.lcc.build;

public class Client {

    public void construct(Builder builder) {
        builder.build_CPU();
        builder.build_mainboard();
        builder.build_memory();
        builder.build_DISK();
        builder.build_power();
    }
}
