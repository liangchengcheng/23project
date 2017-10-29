package com.lcc.menmian;

public class Computer {


    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void start() {
        System.out.print("Computer start begin");
        cpu.start();
        disk.start();
        memory.start();
        System.out.print("Computer start end");
    }

    public void shutDown() {
        System.out.print("Computer shutDown begin");
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
        System.out.print("Computer shutDown end...");
    }


}
