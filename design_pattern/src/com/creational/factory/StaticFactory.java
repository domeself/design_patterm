package com.creational.factory;

/**
 * @module  desigh patterm
 * @ClassName StaticFactory
 * @Description 静态工厂、简单工厂
 * @Author superNove
 * @Date 2019/4/14 21:07
 * @Version 1.0
 */

public  interface StaticFactory {

    public static Piza create(String type){
        switch (type){
            case "xx": return new KDJCheesesPiza();
            case "xxxx": return  new KDJCreamPiza();
            default: return null;
        }
    }
}
