package com.lcc.zhuangshi;

public class SubjectPreDecorator implements ISubject {

    private ISubject subject;

    public SubjectPreDecorator(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void action() {
        preAction();
        subject.action();
    }

    private void preAction() {
        System.out.print("SubjectPreDecorator.preAction()");
    }
}
