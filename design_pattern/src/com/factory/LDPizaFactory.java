package com.factory;

import com.observer.AbstractSubject;

public class LDPizaFactory implements AbstractFactory {

    private  String pizaType;

    public String getPizaType() {
        return pizaType;
    }

    public void setPizaType(String pizaType) {
        pizaType = pizaType;
    }

    @Override
    public Piza createPixa() {
        if(pizaType.endsWith("cheeses")){
            return new LDCheesesPiza();
        }
        if(pizaType.endsWith("cream")){
            return new LDCreamPiza();
        }
        return null;
    }
}
