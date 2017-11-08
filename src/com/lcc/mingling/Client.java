package com.lcc.mingling;

import java.io.IOException;

public class Client {

    /**
     * 4      * @param args
     * 5
     */
    public static void main(String[] args) throws Exception {
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

        int[] arr = new int[] { 12, 23, 34, 45, 56, 67, 77, 89, 90 };
        System.out.println(search(arr, 12));
        System.out.println(search(arr, 45));
        System.out.println(search(arr, 67));
        System.out.println(search(arr, 89));
        System.out.println(search(arr, 99));

    }

    // TODO: 2017/10/30 使用场景 http://www.cnblogs.com/devinzhang/archive/2012/01/06/2315235.html 
    // TODO: 2017/10/30 模拟的是电视剧和遥控

    public static int search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (key < arr[middle]) {
                end = middle - 1;
            } else if (key > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
