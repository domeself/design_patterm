package com.creational.prototype;

import java.io.IOException;

public class ProtoTypeMain {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        /*Person p = new Person();
        p.setAge(2);
        p.setName("liu");
        Person clone = (Person) p.clone();
        System.out.println(clone.getAge());*/

        Person2 person2 = new Person2();
        person2.setAge(23);
        person2.setName("323");

        Person2 deepClone = DeepClone.deepClone(person2);
        Person2 deepClone2 = DeepClone.deepClone(person2);
        System.out.println(deepClone==deepClone2);

    }
}
