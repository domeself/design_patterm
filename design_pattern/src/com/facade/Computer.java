package com.facade;

public class Computer {
    private Disk disk;
    private CPU cpu;
    public void start(){
        cpu.start();
        disk.start();
    }

    public void shutdown(){
        disk.shutdown();
        cpu.shutdown();
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
}
