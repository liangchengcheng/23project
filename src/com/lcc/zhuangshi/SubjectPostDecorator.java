package com.lcc.zhuangshi;

public class SubjectPostDecorator implements ISubject{

    private ISubject subject;
    public SubjectPostDecorator(ISubject subject) {
        this.subject = subject;
    }
    @Override
    public void action() {
        subject.action();
        postAction();
    }
    private void postAction() {
       System.out.print("SubjectPostDecorator.preAction()");
    }

}
