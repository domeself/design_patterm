package com.structural.bridge;


public class DriverManager {
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public void connection(){
        this.dataSource.connetion();
    }
}
