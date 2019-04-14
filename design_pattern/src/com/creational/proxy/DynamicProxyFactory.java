package com.creational.proxy;

import java.lang.reflect.Proxy;

/**
 * @module javaSE
 * @ClassName DynamicProxy
 * @Description
 * @Author superNove
 * @Date 2019/4/14 20:18
 * @Version 1.0
 */

public class DynamicProxyFactory<T> {


    public static <T>T create(Class t){
     return (T)Proxy.newProxyInstance(t.getClassLoader(),t.getInterfaces(),(proxy,mothod,args)->{
            return mothod.invoke(args);
        });
    }

    public static void main(String[] args22) {
        Test test = new Test();
        Object o = Proxy.newProxyInstance(Test.class.getClassLoader(),Test.class.getInterfaces(), (proxy, mothod, args) -> {
            return mothod.invoke(test,args);
        });
        TestInterface t = (TestInterface)o;
        t.show();
    }
}
