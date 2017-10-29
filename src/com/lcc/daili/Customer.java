package com.lcc.daili;

public class Customer {


    public static void main(String args[]){
        //定义一个java码农
        ICoder coder = new JavaCoder("Zhang");
        //定义一个产品经理
        ICoder proxy = new CoderProxy(coder);
        //让产品经理实现一个需求
        proxy.implDemard("java");
    }


}
