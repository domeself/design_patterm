package com.creational.singleton;

/**
 * @module design patterns
 * @ClassName SingleTonL1
 * @Description 单例模式 懒汉式
 * @Author superNove
 * @Date 2019/4/14 18:03
 * @Version 1.0
 */

public class SingleTonL {
    private  SingleTonL(){}
    private volatile static  SingleTonL instance;  //volatile  禁止编译优化重排
    public SingleTonL getInstance(){
        if(instance==null){
            synchronized (this){  //加锁防止并发读
                if(instance==null){// 二次检查，防止this阻塞队列中的线程
                    instance = new SingleTonL();
                }
            }
        }
        return instance;
    }
}
