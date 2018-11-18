package com.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject implements Subject {
    public List<Observer> list= new ArrayList();

    @Override
    public void addObserver(Observer observer) {
        if(!list.contains(observer)){
            list.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        list.stream().forEach(Observer::update);
    }
}
