package com.observer;

public class MyObserver1 implements Observer {
    @Override
    public void update() {
        System.out.println("myObserver1 has update");
    }
}
