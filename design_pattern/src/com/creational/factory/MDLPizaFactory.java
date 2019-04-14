package com.creational.factory;

/**
 * 麦当劳披萨工厂
 */
public class MDLPizaFactory implements AbstractFactory {
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
            return new MDLCheesesPiza();
        }
        if(pizaType.endsWith("cream")){
            return new MDLCreamPiza();
        }
        return null;
    }
}
