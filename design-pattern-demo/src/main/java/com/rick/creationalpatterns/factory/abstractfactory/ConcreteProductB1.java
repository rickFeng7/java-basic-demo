package com.rick.creationalpatterns.factory.abstractfactory;

/**
 * @author fengrui
 * @date 2022/5/15
 * @description 具体产品B1：实现抽象产品中的抽象方法
 */
public class ConcreteProductB1 implements Product2 {
    @Override
    public void show() {
        System.out.println("具体产品B1显示...");
    }
}
