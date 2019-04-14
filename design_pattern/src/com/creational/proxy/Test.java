package com.creational.proxy;

/**
 * @module design patterm
 * @ClassName Test
 * @Description  被代理目标
 * @Author superNove
 * @Date 2019/4/14 20:10
 * @Version 1.0
 */

public class Test implements TestInterface {
    @Override
    public String show() {
        System.out.println("11111111111111111");
        return "OK";
    }
}
