package com.structural.facade;

public class FacadeMain {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Disk disk = new Disk();
        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setDisk(disk);
        computer.start();
        computer.shutdown();
    }

}
