package com.structural.decorator;

/**
 *  本体
 */
public class Swimmers implements Swimming {
    @Override
    public void swim() {
        System.out.println("跳入水中，开始狗刨式游泳");
    }
}
