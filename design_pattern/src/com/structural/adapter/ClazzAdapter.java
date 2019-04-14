package com.structural.adapter;

/**
 *  类适配器，将类中实现的方法，适配给接口
 */
public class ClazzAdapter extends Source implements TargetInterface {

    @Override
    public void method2() {
        System.out.println("我是类适配器中的方法2");
    }
}
