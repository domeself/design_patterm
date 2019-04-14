package com.creational.singleton;

/**
 * @module design patterns
 * @ClassName SingleTonB
 * @Description  单例模式  饿汉式2
 * @Author superNove
 * @Date 2019/4/14 18:14
 * @Version 1.0
 */

public class SingleTonE2 {

    private SingleTonE2(){};

    private static class SingleTonEHolder{
        private static SingleTonE2 instance = new SingleTonE2();
    }

    //通过静态内部类延迟加载
    public SingleTonE2 getInstance(){
        return SingleTonEHolder.instance;
    }
}
