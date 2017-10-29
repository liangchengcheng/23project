package com.lcc.zerenlian;

public class ConcreteHandler extends Handler {

    /**
     * 处理方法。调用这个方法处理请求
     */
    @Override
    public void handleRequest() {

        /**
         * 判断是否有后继者的责任对象
         * 有的话就转发请求给这个对象
         * 没有就自己处理
         */
        if (getSuccessor() != null){
            System.out.print("放过请求继续");
            getSuccessor().handleRequest();
        }else {
            System.out.print("处理这个请求");
        }
    }
}
