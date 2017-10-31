package com.lcc.mingling;

/**
 * 命令的接口
 */
public interface Command {

    //执行操作
    void excute();

    //撤销操作
    void unDo();
}
