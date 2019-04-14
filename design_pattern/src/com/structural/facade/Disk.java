package com.structural.facade;

/**
 *  硬盘
 */
public class Disk {
    /**
     * 硬盘启动
     */
    public void start(){
        System.out.println("disk is start");
    }

    /**
     *  硬盘停止
     */
    public void shutdown(){
        System.out.println("disk is shutDown");
    }
}
