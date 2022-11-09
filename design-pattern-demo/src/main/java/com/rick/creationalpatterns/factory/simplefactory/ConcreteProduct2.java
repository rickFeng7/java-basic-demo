package com.rick.creationalpatterns.factory.simplefactory;

/**
 * @author fengrui
 * @date 2022/5/15
 * @description 具体产品：Product2
 */
public class ConcreteProduct2 implements Product {

    @Override
    public void show() {
        System.out.println("具体产品2显示...");
    }
}
