package com.bridge;

public class DataSource2 implements  DataSource{
    @Override
    public void connetion() {
        System.out.println("datasource2连接数据库");
    }
}
