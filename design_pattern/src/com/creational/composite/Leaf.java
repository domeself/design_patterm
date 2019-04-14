package com.creational.composite;

/**
 * @module javaSE
 * @ClassName Leaf
 * @Description
 * @Author superNove
 * @Date 2019/4/15 1:36
 * @Version 1.0
 */

public class Leaf extends  Component {
    private String name;
    public Leaf(String name) {
       this.name = name;
    }

    @Override
    public void display() {
        System.out.println("我是"+name+"叶子");
    }
}
