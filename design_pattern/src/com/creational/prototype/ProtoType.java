package com.creational.prototype;

/**
 * @module javaSE
 * @ClassName ProtoType
 * @Description
 * @Author superNove
 * @Date 2019/4/14 19:21
 * @Version 1.0
 */

public abstract class ProtoType  implements Cloneable{
    ProtoType clone = null;
    public  ProtoType  clone() throws CloneNotSupportedException{
        try {
            clone = (ProtoType)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }



}
 class ConcretePrototype1 extends ProtoType {
    @Override
    public ProtoType clone() throws CloneNotSupportedException {
        return (ConcretePrototype1)super.clone();
    }
}

 class ConcretePrototype2 extends ProtoType {
    @Override
    public ProtoType clone() throws CloneNotSupportedException {
        return (ConcretePrototype2)super.clone();
    }
}