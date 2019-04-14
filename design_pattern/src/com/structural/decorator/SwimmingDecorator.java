package com.structural.decorator;

/**
 * 装饰器
 */
public abstract class SwimmingDecorator implements Swimming {
    private Swimming swimmer;
    public void setSwimmer(Swimming runner){
        this.swimmer=runner;
    }
    @Override
    public void swim() {
        swimmer.swim();
    }
}
