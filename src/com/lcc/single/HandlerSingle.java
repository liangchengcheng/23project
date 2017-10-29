package com.lcc.single;

public class HandlerSingle {
    /**
     * 静态的类
     */
    private static class SinletonHolder{
        //静态 不 可变
        private static final HandlerSingle single = new HandlerSingle();
        private SinletonHolder (){

        }
    }

    private HandlerSingle (){
    }

    /**
     * 直接调用一个静态类的静态不可变的常量
     */
    public synchronized static HandlerSingle getInstance(){
        return SinletonHolder.single;
    }


}
