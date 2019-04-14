package com.creational.composite;

/**
 * @module design patterns
 * @ClassName Component  组合模式
 * @Description   组件
 * @Author superNove
 * @Date 2019/4/15 1:33
 * @Version 1.0
 */

public abstract class Component {
    private String name;
    public Component(String name){
        this.name = name;
    }
    public Component(){};
    public abstract void display() ;
}
