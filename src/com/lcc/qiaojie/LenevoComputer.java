package com.lcc.qiaojie;

public class LenevoComputer extends AbstractComputer {

    public LenevoComputer(CpuAbility cpuAbility) {
        super(cpuAbility);
    }

    @Override
    public void checkPcAbility() {
        System.out.print("联想电脑的cpu" + cpuAbility.abilityCpu());
    }
}
