package com.factory;

public class NYPizaFactory implements AbstractFactory {
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
            return new NYCheesesPiza();
        }
        if(pizaType.endsWith("cream")){
            return new NYCreamPiza();
        }
        return null;
    }
}
