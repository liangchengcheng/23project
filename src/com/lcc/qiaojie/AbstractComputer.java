package com.lcc.qiaojie;

public abstract class AbstractComputer {
    CpuAbility cpuAbility;

    public AbstractComputer(CpuAbility cpuAbility){
        this.cpuAbility = cpuAbility;
    }

    public abstract void checkPcAbility();
}
