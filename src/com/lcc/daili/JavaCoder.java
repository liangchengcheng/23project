package com.lcc.daili;

public class JavaCoder implements ICoder {

    private String name;

    public JavaCoder(String name){
        this.name = name;
    }

    @Override
    public void implDemard(String demanName) {
        System.out.println(name + " implemented demand:" + demanName + " in JAVA!");
    }
}
