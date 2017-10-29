package com.lcc.qiaojie;

public class IswComputer extends AbstractComputer {

    public IswComputer(CpuAbility cpuAbility) {
        super(cpuAbility);
    }

    @Override
    public void checkPcAbility() {
        System.out.println("IBM笔记本CPU性能" + super.cpuAbility.abilityCpu());
    }
}
