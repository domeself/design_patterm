package com.decorator;

public class ButterflyDecorator extends SwimmingDecorator {
    @Override
    public void swim() {
        super.swim();
        butterfly();
    }
    public void butterfly(){
        System.out.println("80%几率使出了蝶泳技巧");
    }
}
