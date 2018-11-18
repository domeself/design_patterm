package com.observer;

public class ObserverMain  {
    public static void main(String[] args) {
        Subject mySubject = new MySubject();
        Observer myObserver1 = new MyObserver1();
        Observer myObserver2 = new MyObserver2();
        mySubject.addObserver(myObserver1);
        mySubject.addObserver(myObserver2);
        mySubject.operation();
    }
}
