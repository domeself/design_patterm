package com.bridge;

public class BridgeMain {


    public static void main(String[] args) {
        DataSource dataSource1 = new DataSource1();
        DataSource dataSource2 = new DataSource2();
        DriverManager driverManager = new DriverManager();
        driverManager.setDataSource(dataSource1);
        driverManager.connection();
        driverManager.setDataSource(dataSource2);
        driverManager.connection();
    }
}
