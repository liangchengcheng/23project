package com.lcc.celue;

/**
 * 1号策略
 */
public class OperationAdd implements Operation {
    @Override
    public void doOperation(int a, int b) {
        System.out.println(a+"+"+b+"="+(a+b));
    }
}
