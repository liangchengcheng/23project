package com.lcc.mingling;

public class Client {

    /**
     * 4      * @param args
     * 5
     */
    public static void main(String[] args) {
        // 创建命令的接受者
        Receiver receiver = new Receiver();
        // 创建命令对象，并设定它的接受者
        Command command = new ConcreteCommand(receiver);
        // 创建命令执行者，并将相应的命令作为参数传递给Invoker
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        // Client端测试一下
        invoker.excuteCommmand();
        invoker.undoCommand();
    }

    // TODO: 2017/10/30 使用场景 http://www.cnblogs.com/devinzhang/archive/2012/01/06/2315235.html 
    // TODO: 2017/10/30 模拟的是电视剧和遥控 
}
