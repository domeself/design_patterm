package com.structural.adapter;

/**
 * @module design patterns
 * @ClassName TargetObject
 * @Description  实现接口适配器，只实现需要实现的方法
 * @Author superNove
 * @Date 2019/4/15 0:30
 * @Version 1.0
 */

public class TargetObject extends DefaultAdapter {

    @Override
    public void method1() {
        System.out.println("只用实现想要实现的类");
    }
}
