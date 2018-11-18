package com.observer;

public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("触发operation操作");
        notifyObserver();
    }
}
