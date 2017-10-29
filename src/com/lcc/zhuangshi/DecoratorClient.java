package com.lcc.zhuangshi;

/**
 * 装饰设计模式
 */
public class DecoratorClient {

    public static void main(String[] args) {
        ISubject subject = new ConcreteSubject();
        ISubject preDecorator = new SubjectPreDecorator(subject);
        ISubject postDecorator = new SubjectPostDecorator(preDecorator);
        postDecorator.action();
    }


}
