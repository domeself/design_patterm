package com.creational.factory;

/**
 * 肯德基披萨工厂
 */
public class KDJPizaFactory implements AbstractFactory {

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
            return new KDJCheesesPiza();
        }
        if(pizaType.endsWith("cream")){
            return new KDJCreamPiza();
        }
        return null;
    }
}
