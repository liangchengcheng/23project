package com.lcc.celue;

/**
 * 策略中心，设置自己想用的策略
 */
public class OperationStrategy {
    private Operation operation;

    public OperationStrategy(Operation operation) {
        this.operation = operation;
    }

    //执行策略
    public void executeStrategy(int a, int b) {
        operation.doOperation(a, b);
    }
}
