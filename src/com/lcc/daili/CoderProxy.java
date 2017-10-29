package com.lcc.daili;

public class CoderProxy implements ICoder{

    private ICoder coder;

    public CoderProxy(ICoder coder){
        this.coder = coder;
        //这个地方可以不用传递对象。而是自己判断对象来此哪个api
    }

    @Override
    public void implDemard(String demanName) {
        coder.implDemard(demanName);
    }
}
