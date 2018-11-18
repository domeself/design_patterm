package com.adapter;

import java.sql.SQLOutput;

public class ObjectAdapter implements TargetInterface {
    private Source source;

    public  ObjectAdapter(Source source){
        this.source=source;
    }

    @Override
    public void method1() {
        source.method1();

    }

    @Override
    public void method2() {
        System.out.println("我是类适配器中的方法2");
    }
}
