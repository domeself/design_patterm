package com.structural.adapter;

/**
 *  对象适配器
 */
public class ObjectAdapter extends TargetAbstract {
    private Source source;

    public  ObjectAdapter(Source source){
        this.source=source;
    }

    @Override
    public void method1() {
        source.method1();
    }
}
