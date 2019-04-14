package com.structural.decorator;

/**
 * 增强2
 */
public class BreaststrokeDecorator extends SwimmingDecorator {
    @Override
    public void swim() {
        super.swim();
        breaststroke();
    }

    public void breaststroke(){
        System.out.println("10%触发蛙泳技巧");
    }
}
