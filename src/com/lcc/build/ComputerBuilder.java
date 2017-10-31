package com.lcc.build;

public class ComputerBuilder implements Builder {

    // TODO: 2017/10/30 这个很重
    private Computer computer = new Computer();

    @Override
    public void build_CPU() {
        computer.parts.add("采用INTEL的CPU");
    }

    @Override
    public void build_mainboard() {
        computer.parts.add("采用大型主版");
    }

    @Override
    public void build_memory() {
        computer.parts.add("采用8G内存");
    }

    @Override
    public void build_DISK() {
        computer.parts.add("采用1TB固态硬盘");
    }

    @Override
    public void build_power() {
        computer.parts.add("采用XXX电源");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}

