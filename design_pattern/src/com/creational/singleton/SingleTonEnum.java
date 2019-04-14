package com.creational.singleton;

/**
 * @module design patterm
 * @ClassName SingleTonEnum
 * @Description  单例模式  枚举
 * @Author superNove
 * @Date 2019/4/14 18:51
 * @Version 1.0
 */

public class SingleTonEnum {
    private  SingleTonEnum(){};
    public   static  SingleTonEnum getInstance(){
        return  SingleTomHolder.INSTANCE.instance;
    }

    private enum SingleTomHolder{
        INSTANCE;
        private  SingleTonEnum instance;
        SingleTomHolder(){  //jvm 保障构造方法只会被调用一次
            instance = new SingleTonEnum();
        }
    }
}
