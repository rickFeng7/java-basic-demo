package com.rick.creationalpatterns.factory.abstractfactory;

/**
 * @author fengrui
 * @date 2022/5/15
 * @description 具体产品A1：实现抽象产品中的抽象方法
 */
public class ConcreteProductA1 implements Product1 {
    @Override
    public void show() {
        System.out.println("具体产品A1显示...");
    }
}
