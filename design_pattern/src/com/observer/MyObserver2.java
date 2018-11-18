package com.observer;

public class MyObserver2 implements Observer {
    @Override
    public void update() {
        System.out.println("myObserver2 has update");
    }
}
