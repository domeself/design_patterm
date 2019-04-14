package com.creational.proxy;

import java.lang.reflect.Proxy;

/**
 * @module design patterm
 * @ClassName TestProxy
 * @Description  静态代理
 * @Author superNove
 * @Date 2019/4/14 20:08
 * @Version 1.0
 */

public class StaticProxy  implements  TestInterface{
    private TestInterface testInterface;
    public StaticProxy(TestInterface testInterface){
        this.testInterface = testInterface;
    }
    public static void main(String[] args) {
        Test test = new Test();
        TestInterface proxy = new StaticProxy(test);
        proxy.show();
    }

    @Override
    public String show() {
        System.out.println("proxy before");
        String show = testInterface.show();
        System.out.println("proxy after");
        return  show;
    }
}
