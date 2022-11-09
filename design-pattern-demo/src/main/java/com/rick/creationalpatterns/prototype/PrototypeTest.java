package com.rick.creationalpatterns.prototype;

/**
 * @author fengrui
 * @date 2022/5/16
 * @description
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType obj1 = new RealizeType();
        RealizeType obj2 = obj1.clone();
        System.out.println("obj1 == obj2 ? " + (obj1 == obj2));
    }
}
