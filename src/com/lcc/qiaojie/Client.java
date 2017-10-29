package com.lcc.qiaojie;

/**
 * 2个维度的2个对象
 * http://www.cnblogs.com/draem0507/p/3794530.html
 */
public class Client {

    public static void main(String[] args){
        CpuAbility ability =new IntelCpu();
        AbstractComputer computer =new LenevoComputer(ability);
        computer.checkPcAbility();

        //华硕笔记本CPU性能系能比较牛
        ability =new AdmCpu();
        computer =new IswComputer(ability);
        //IBM笔记本CPU性能系能一般
        computer.checkPcAbility();
    }
}
