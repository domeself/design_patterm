package com.structural.facade;

/**
 *  计算机（外观）
 */
public class Computer {
    private Disk disk;
    private CPU cpu;

    /**
     * 计算机启动
     */
    public void start(){
        cpu.start();
        disk.start();
    }

    /**
     * 计算机停止
     */
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
