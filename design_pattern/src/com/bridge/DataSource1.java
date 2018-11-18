package com.bridge;

public class DataSource1 implements  DataSource{
    @Override
    public void connetion() {
        System.out.println("datasource1连接数据库");
    }
}
